package android.callongde_android.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.support.v4.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_popup_dialog.*
import android.R
import android.callongde_android.survey.UserInfoActivity
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import org.jetbrains.anko.support.v4.startActivity


class PopupDialog : DialogFragment(){



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(android.callongde_android.R.layout.fragment_popup_dialog, container, false)

        dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setOnBtnClikListener()
    }

    private fun setOnBtnClikListener(){
        btn_popup_dialog_yes.setOnClickListener {
            startActivity<UserInfoActivity>()
            dismiss()
        }
        btn_popup_dialog_no.setOnClickListener {
            dismiss()
        }
    }
}