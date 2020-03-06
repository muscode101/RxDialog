package com.muscode.rxdialogdemo.di.modules


import dagger.Module
import dagger.Provides
import io.reactivex.rxjava3.subjects.PublishSubject
import javax.inject.Singleton

@Module
class RxModule {
//    @Singleton
//    @Provides
//    fun provideServicePublisher(): PublishSubject<ServiceData> =
//        PublishSubject.create<ServiceData>()
//
//    @Singleton
//    @Provides
//    fun provideFragPublisher(): PublishSubject<MyCircularProgressBar> =
//        PublishSubject.create<MyCircularProgressBar>()
//
//    @Singleton
//    @Provides
//    fun provideActionPublisher(): PublishSubject<MyInt> = PublishSubject.create<MyInt>()
//
//    @Singleton
//    @Provides
//    fun providesActionObservable(publishAction: PublishSubject<MyInt>): io.reactivex.Observable<MyInt> =
//        publishAction.ofType(MyInt::class.java)
//
//    @Singleton
//    @Provides
//    fun providesServiceObservable(publishSubject: PublishSubject<ServiceData>): io.reactivex.Observable<ServiceData> =
//        publishSubject.ofType(ServiceData::class.java)
}