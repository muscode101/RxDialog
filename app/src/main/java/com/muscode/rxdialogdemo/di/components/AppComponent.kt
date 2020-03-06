package com.muscode.rxdialogdemo.di.components

import com.muscode.rxdialogdemo.di.App
import com.muscode.rxdialogdemo.di.factories.ActivitiesInjectorFactories
import com.muscode.rxdialogdemo.di.factories.FragmentsInjectorFactories
import com.muscode.rxdialogdemo.di.modules.AppModule
import com.muscode.rxdialogdemo.di.modules.RepositoryModule
import com.muscode.rxdialogdemo.di.modules.RxModule
import com.muscode.rxdialogdemo.di.modules.UtilsModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,
    ActivitiesInjectorFactories::class,
    FragmentsInjectorFactories::class,
    RepositoryModule::class,
    UtilsModule::class,
    RxModule::class,
    AppModule::class
])

interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
