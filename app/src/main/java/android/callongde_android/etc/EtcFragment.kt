package android.callongde_android.etc


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.callongde_android.R
import android.callongde_android.mysharon.MySharonActivity
import android.callongde_android.mysharon.MySharonOverviewData
import android.callongde_android.notice.NoticeActivity
import android.callongde_android.question.QuestionActivity
import android.callongde_android.util.MyDBHandler
import android.graphics.Color
import android.util.Log
import kotlinx.android.synthetic.main.fragment_etc.*
import org.jetbrains.anko.support.v4.startActivity

class MypageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_etc, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setOnBtnClickListener()
        setMypickNum()
    }

    private fun setMypickNum() {
        val dbHandler = MyDBHandler(context!!, null, null, 6)

        var listOfData: ArrayList<MySharonOverviewData> = dbHandler.findMyPickProduct(1)

        var count: Int = 0
        for (e in listOfData){
            count = count + 1
        }

        txt_mypage_flower.text = count.toString() + " 송이"
    }

    private fun setOnBtnClickListener() {
        rl_etc_my_sharon.setOnClickListener {
            startActivity<MySharonActivity>()
        }
        rl_etc_notice.setOnClickListener {
            startActivity<NoticeActivity>()
        }
        rl_etc_question.setOnClickListener {
            startActivity<QuestionActivity>()
        }

        btn_etc_on.setOnClickListener {
            btn_etc_on.setBackgroundResource(R.drawable.alram_on_background)
            txt_etc_on.setTextColor(Color.parseColor("#ffffff"))
            btn_etc_off.setBackgroundResource(R.drawable.alram_off_background)
            txt_etc_off.setTextColor(Color.parseColor("#a4a4a4"))
        }
        btn_etc_off.setOnClickListener {
            btn_etc_on.setBackgroundResource(R.drawable.alram_off_background)
            txt_etc_on.setTextColor(Color.parseColor("#a4a4a4"))
            btn_etc_off.setBackgroundResource(R.drawable.alram_on_background)
            txt_etc_off.setTextColor(Color.parseColor("#ffffff"))
        }
                   }


}
