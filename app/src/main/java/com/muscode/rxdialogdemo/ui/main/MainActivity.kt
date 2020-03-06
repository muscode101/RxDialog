package com.muscode.rxdialogdemo.ui.main

import android.os.Bundle
import com.muscode.rxdialogdemo.R
import com.muscode.rxdialogdemo.ui.dialogs.RxDialog
import com.muscode.rxdialogdemo.ui.main.fragments.MainFragment
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var rxDialog: RxDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()
    }

    private fun initListeners() {
        btn_open_fragment.setOnClickListener {
            startMainFragment()
        }
        btn_open_dialog.setOnClickListener {
            showRxDialog()
        }
    }

    private fun showRxDialog() {
        rxDialog.show(supportFragmentManager, getString(R.string.rx_dialog))
    }

    private fun startMainFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.MainFragment, MainFragment())
            .commit()
    }
}