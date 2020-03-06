package com.muscode.rxdialogdemo.di.factories


import com.muscode.rxdialogdemo.ui.main.fragments.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope

@Module
abstract class FragmentsInjectorFactories {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindTimerPlusFragment(): MainFragment
}