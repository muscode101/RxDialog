package com.muscode.rxdialogdemo.di.modules


import com.muscode.rxdialogdemo.ui.dialogs.RxDialog
import dagger.Module
import dagger.Provides


@Module
class UtilsModule {

    @Provides
    fun providesRxDialog():RxDialog = RxDialog()


}