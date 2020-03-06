package com.muscode.rxdialogdemo.ui.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import com.muscode.rxdialogdemo.R
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject
import kotlinx.android.synthetic.main.dialog_record.view.*


class RxDialog : DialogFragment() {

    private lateinit var root: View
    private val publisher = PublishSubject.create<String>()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return requireActivity().let {
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater
            root = inflater.inflate(R.layout.dialog_record, null)
            builder.setView(root)


            root.btn_publish.setOnClickListener {
                publish(getText())
            }

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    private fun getText():String = root.et_text.text.toString()

    private fun publish(text: String) = publisher.onNext(text)

    fun onTextPublishedListener(): Observable<String> = publisher.ofType(String::class.java)
}