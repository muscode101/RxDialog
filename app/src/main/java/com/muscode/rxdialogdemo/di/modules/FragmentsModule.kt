package com.muscode.rxdialogdemo.di.modules


import com.muscode.rxdialogdemo.ui.main.fragments.MainFragment
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class FragmentsModule {

    @Singleton
    @Provides
    fun providesRxDialog(): MainFragment = MainFragment()


}