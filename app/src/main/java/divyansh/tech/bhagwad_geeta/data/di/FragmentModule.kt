package divyansh.tech.bhagwad_geeta.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped
import divyansh.tech.bhagwad_geeta.domain.chapter.epoxy.ChapterController

@Module
@InstallIn(FragmentComponent::class)
class FragmentModule {

    @Provides
    @FragmentScoped
    fun provideChapterController(): ChapterController = ChapterController()
}