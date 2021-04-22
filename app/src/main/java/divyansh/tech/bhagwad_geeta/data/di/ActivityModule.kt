package divyansh.tech.bhagwad_geeta.data.di

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import divyansh.tech.bhagwad_geeta.domain.Callbacks
import divyansh.tech.bhagwad_geeta.presentation.player.PlayerFragment
import divyansh.tech.bhagwad_geeta.presentation.read.ReadFragment
import divyansh.tech.bhagwad_geeta.presentation.settings.SettingsFragment

/*
* Module to provide dependencies to the Main Activity
* */
@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    /*
    * Function to provide Read Fragment
    * @returns ReadFragment instance
    * */
    @Provides
    @ActivityScoped
    fun provideReadFragment(): ReadFragment = ReadFragment()

    /*
    * Function to provide PLayer Fragment
    * @returns PlayerFragment instance
    * */
    @Provides
    @ActivityScoped
    fun providePlayerFragment(): PlayerFragment = PlayerFragment()

    /*
    * Function to provide Settings Fragment
    * @returns SettingsFragment instance
    * */
    @Provides
    @ActivityScoped
    fun provideSettingsFragment(): SettingsFragment = SettingsFragment()
}