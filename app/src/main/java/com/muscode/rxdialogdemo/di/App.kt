package com.muscode.rxdialogdemo.di


import com.muscode.rxdialogdemo.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().create(this)

//    override fun attachBaseContext(base: Context) {
//        super.attachBaseContext(base)
////        MultiDex.install(this)
//    }
}