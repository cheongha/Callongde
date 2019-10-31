package android.callongde_android.choose

import android.app.Dialog
import android.callongde_android.R
import android.callongde_android.util.MyDBHandler
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_contact_dialog.*
import org.jetbrains.anko.support.v4.toast

class ContactDialog : DialogFragment(){

    private var hanbok_name = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_contact_dialog, container, false)

        dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        hanbok_name = arguments!!.getString("hanbok_name")
        Log.d("TAG", hanbok_name)
        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        txt_contact_hanbok_name.text = hanbok_name
        setOnBtnClikListener()
        lookupProduct(hanbok_name)
    }

    fun lookupProduct(hanbok_name: String) {
        val dbHandler = MyDBHandler(context!!, null, null, 6)

        val hanbok = dbHandler.findProduct(hanbok_name)

        if (hanbok != null) {
            Glide.with(this)
                .load(hanbok.market_img)
                .into(img_contact_market)

            txt_contact_hanbok_name.text = hanbok.hanbok_name.toString()
            txt_contact_market_name.text = hanbok.market_name
            txt_contact_place.text = hanbok.market_address
            txt_contact_opening.text = hanbok.opening_time
            txt_contact_website.text = hanbok.website
            txt_contact_market_number.text = hanbok.contact_number
            txt_contact_sentence.text = hanbok.words

            if (hanbok.kakao_talk == 1){
                btn_contact_kakao.visibility = View.VISIBLE}

        } else {
            toast("데이터를 불러올 수 없습니다.")
        }
    }

    private fun setOnBtnClikListener(){
        btn_contact_back.setOnClickListener {
            dismiss()

        }
    }
}