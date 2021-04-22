package divyansh.tech.bhagwad_geeta.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import divyansh.tech.bhagwad_geeta.data.api.ChapterService
import divyansh.tech.bhagwad_geeta.utils.C.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/*
* Network Module to provide the networking dependencies
* */
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    /*
    * Function to provide retrofit instance
    * @returns Retrofit Instance
    * */
    @Provides
    @Singleton
    fun provideRetrofitInstance(): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

    /*
    * Function to provide the chapter service
    * @param retrofit -> Retrofit Instance
    * @returns ChapterService
    * */
    @Provides
    @Singleton
    fun providesChapterService(
        retrofit: Retrofit
    ): ChapterService =
        retrofit.create(ChapterService::class.java)
}