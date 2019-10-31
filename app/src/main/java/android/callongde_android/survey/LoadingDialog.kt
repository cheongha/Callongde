package android.callongde_android.survey

import android.callongde_android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v4.app.DialogFragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_loading_dialog.*

class LoadingDialog : DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(android.callongde_android.R.layout.fragment_loading_dialog, container, false)

        dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Glide.with(this)
            .load(android.callongde_android.R.drawable.loading_flower)
            .into(gif_loading)
    }
}