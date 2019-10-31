package android.callongde_android.filter

import android.callongde_android.R
import android.callongde_android.filter.Data.FilterContentData
import android.callongde_android.main.MainActivity
import android.callongde_android.survey.UserInfoActivity
import android.callongde_android.util.BaseActivity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RelativeLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_filter_acitivity.*
import kotlinx.android.synthetic.main.rv_item_filter_content.*
import org.jetbrains.anko.startActivity

class FilterActivity : BaseActivity() {
    private val filterFragment by lazy {
        FilterFragment()
    }

    private var filterFlag = 0

    val array = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_acitivity)


        configureTitleBar()
        setOnClickListener()
    }

    private fun configureTitleBar() {
        btn_filter_back.setOnClickListener {
            val intent = Intent(this@FilterActivity, MainActivity::class.java)
            intent.putExtra("filterFlag", filterFlag)
            setResult(0, intent)
            finish()
        }
        // 설문 필터
        btn_filter_filter.setOnClickListener {
            startActivity<UserInfoActivity>()
            finish()
        }
        btn_filter_filter2.setOnClickListener {
            startActivity<UserInfoActivity>()
            finish()
        }
        // 필터값이 적용된 것!!!
        btn_filter_outcome.setOnClickListener {
            val intent = Intent(this@FilterActivity, MainActivity::class.java)
            intent.putExtra("filterFlag", array)
            setResult(9, intent)

            /*val bundle = Bundle()
            bundle.putStringArrayList("filterFlag", array)
            filterFragment.arguments = bundle*/


            Log.e("filter", array.toString())
            finish()
        }
    }

    private fun setOnClickListener() {
        setClickListenerOnRelativeView(btn_filter_male, txt_filter_male)
        setClickListenerOnRelativeView(btn_filter_female, txt_filter_female)
        setClickListenerOnRelativeView(btn_filter_child, txt_filter_child)
        setClickListenerOnRelativeView(btn_filter_adult, txt_filter_adult)
        setClickListenerOnRelativeView(btn_filter_old, txt_filter_old)
        setClickListenerOnRelativeView(btn_filter_tradition, txt_filter_tradition)
        setClickListenerOnRelativeView(btn_filter_modern, txt_filter_modern)
        setClickListenerOnRelativeView(btn_filter_simple, txt_filter_simple)
        setClickListenerOnRelativeView(btn_filter_fancy, txt_filter_fancy)
        setClickListenerOnRelativeView(btn_filter_comfortable, txt_filter_comfortable)
        setClickListenerOnRelativeView(btn_filter_concept, txt_filter_concept)
        setClickListenerOnRelativeView(btn_filter_flower, txt_filter_flower)
        setClickListenerOnRelativeView(btn_filter_health, txt_filter_health)
        setClickListenerOnRelativeView(btn_filter_old_fashion, txt_filter_old_fashion)
        setClickListenerOnRelativeView(btn_filter_picnic, txt_filter_picnic)
        setClickListenerOnRelativeView(btn_filter_party, txt_filter_party)
        setClickListenerOnRelativeView(btn_filter_wedding, txt_filter_wedding)
        setClickListenerOnRelativeView(btn_filter_graduation, txt_filter_graduation)
        setClickListenerOnRelativeView(btn_filter_place1, txt_filter_place1)
        setClickListenerOnRelativeView(btn_filter_place2, txt_filter_place2)
    }

    fun setClickListenerOnRelativeView(relativeLayout: RelativeLayout, textView: TextView) {
        relativeLayout.setOnClickListener {
            // game이 안눌려있을 때 눌린 플로우 -> 주황색 배경, 흰글씨로
            if (!relativeLayout.isSelected) {
                reverseBtn(relativeLayout, textView)
            }
            // game이 눌려있을 경우 눌린 플로우 -> 흰 배경, 주황글씨로
            else {
                filterFlag = 0
                array.add("0")
                relativeLayout.isSelected = !relativeLayout.isSelected
                textView.setTextColor(Color.parseColor("#f2893e"))
                relativeLayout.setBackgroundResource(R.drawable.filiter_content_orange_background)
            }
        }
    }

    private fun reverseBtn(reversedImg: RelativeLayout, reversedTextView: TextView) {
        when (reversedImg) {
            btn_filter_male -> {
                filterFlag = 1
                array.add("남성")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_female -> {
                filterFlag = 2
                array.add("여성")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_child -> {
                filterFlag = 3
                array.add("아동")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_adult -> {
                filterFlag = 4
                array.add("성인")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_old -> {
                filterFlag = 5
                array.add("중년")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_tradition -> {
                filterFlag = 6
                array.add("전통")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_modern -> {
                filterFlag = 7
                array.add("현대")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_simple -> {
                filterFlag = 8
                array.add("단아")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_fancy -> {
                filterFlag = 9
                array.add("화려")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_comfortable -> {
                filterFlag = 10
                array.add("편안")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_concept -> {
                filterFlag = 11
                array.add("컨셉")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_flower -> {
                filterFlag = 12
                array.add("철릭")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_health -> {
                filterFlag = 13
                array.add("건강")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_old_fashion -> {
                filterFlag = 14
                array.add("복고")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_picnic -> {
                filterFlag = 15
                array.add("나들이")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_party -> {
                filterFlag = 16
                array.add("돌잔치")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_wedding -> {
                filterFlag = 17
                array.add("결혼식")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_graduation -> {
                filterFlag = 18
                array.add("졸업식")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_place1 -> {
                filterFlag = 19
                array.add("경복궁")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
            btn_filter_place2 -> {
                filterFlag = 20
                array.add("전주")
                reversedImg.isSelected = true
                reversedTextView.setTextColor(Color.parseColor("#ffffff"))
                reversedImg.setBackgroundResource(R.drawable.filter_content_background)
            }
        }

    }

}
