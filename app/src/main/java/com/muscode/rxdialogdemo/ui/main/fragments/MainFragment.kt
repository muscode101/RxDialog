package com.muscode.rxdialogdemo.ui.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muscode.rxdialogdemo.R
import com.muscode.rxdialogdemo.ui.dialogs.RxDialog
import dagger.android.support.DaggerFragment
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_main.view.*
import javax.inject.Inject

class MainFragment : DaggerFragment() {


    private lateinit var rv: View
    private var compositeDisposable = CompositeDisposable()

    @Inject
    lateinit var rxDialog: RxDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initBindings(inflater, container)

        initRxDialogListener()
        initListeners()

        return rv
    }

    private fun initListeners(){
        rv.btn_open_frag_dialog.setOnClickListener {
            showRxDialog()
        }
    }

    private fun initBindings(inflater: LayoutInflater, container: ViewGroup?) {
        rv = inflater.inflate(R.layout.fragment_main, container, false)
    }

    private fun initRxDialogListener() {
        compositeDisposable.add(
            rxDialog.onTextPublishedListener()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    rv.tv_frag_display.text = it
                }
        )
    }


    private fun showRxDialog() {
        rxDialog.show(requireFragmentManager(), getString(R.string.rx_dialog))
    }

    override fun onDestroy() {
        super.onDestroy()
        if (!compositeDisposable.isDisposed)
            compositeDisposable.dispose()
    }

}