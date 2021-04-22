package divyansh.tech.bhagwad_geeta.data.di

import android.app.Activity
import androidx.fragment.app.Fragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import divyansh.tech.bhagwad_geeta.domain.Callbacks
import divyansh.tech.bhagwad_geeta.domain.chapter.epoxy.ChapterController

@Module
@InstallIn(FragmentComponent::class)
class FragmentModule {

    @Provides
    @FragmentScoped
    fun provideChapterController(callbacks: Callbacks): ChapterController =
        ChapterController(callbacks)

    @Provides
    @FragmentScoped
    fun provideCallback(fragment: Fragment) =
            fragment as Callbacks
}