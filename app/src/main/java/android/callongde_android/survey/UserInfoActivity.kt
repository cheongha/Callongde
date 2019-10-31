package android.callongde_android.survey

import android.callongde_android.R
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_user_info.*
import android.app.Activity
import android.util.Log


class UserInfoActivity : AppCompatActivity() {

    var sex: String = "null"
    var age: String = "null"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_user_info)

        setOnClickListner()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            0 -> if (resultCode === Activity.RESULT_OK) {
                intent = intent
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }

    private fun setOnClickListner() {
        btn_survey_close.setOnClickListener {
            finish()
        }

        // 남 성별 클릭시 색 변경
        ll_user_male.setOnClickListener {
            sex = "m"
            ll_user_male.isSelected = true
            btn_user_male.setImageResource(R.drawable.searchask_1_male_red_icon)
            txt_user_male.setTextColor(Color.parseColor("#eb5f4c"))
            btn_user_female.setImageResource(R.drawable.searchask_1_female_gray_icon)
            txt_user_female.setTextColor(Color.parseColor("#d8d8d8"))
            icon_user_info_under.setImageResource(R.drawable.searchask_1_triangle_red_icon)
            if (ll_user_baby.isSelected == true || ll_user_adult.isSelected == true || ll_user_oldman.isSelected == true)
            {
                btn_user_next.visibility = View.VISIBLE
            }
        }
        // 여 성별 클릭 시 색 변경
        ll_user_female.setOnClickListener {
            sex = "f"
            ll_user_female.isSelected = true
            btn_user_female.setImageResource(R.drawable.searchask_1_female_red_icon)
            txt_user_female.setTextColor(Color.parseColor("#eb5f4c"))
            btn_user_male.setImageResource(R.drawable.searchask_1_male_gray_icon)
            txt_user_male.setTextColor(Color.parseColor("#d8d8d8"))
            icon_user_info_under.setImageResource(R.drawable.searchask_1_triangle_red_icon)
            if (ll_user_baby.isSelected == true || ll_user_adult.isSelected == true || ll_user_oldman.isSelected == true)
            {
                btn_user_next.visibility = View.VISIBLE
            }
        }

        // 아동 클릭시
        ll_user_baby.setOnClickListener {
            age = "b"
            ll_user_baby.isSelected = true
            btn_user_baby.setImageResource(R.drawable.searchask_1_baby_red_icon)
            txt_user_baby.setTextColor(Color.parseColor("#eb5f4c"))
            btn_user_adult.setImageResource(R.drawable.searchask_1_adult_gray_icon)
            txt_user_adult.setTextColor(Color.parseColor("#d8d8d8"))
            btn_user_oldman.setImageResource(R.drawable.searchask_1_oldman_gray_icon)
            txt_user_oldman.setTextColor(Color.parseColor("#d8d8d8"))
            if (ll_user_male.isSelected == true || ll_user_female.isSelected == true)
            {
                btn_user_next.visibility = View.VISIBLE
            }
        }
        // 성인 클릭시
        ll_user_adult.setOnClickListener {
            age = "a"
            ll_user_adult.isSelected = true
            btn_user_baby.setImageResource(R.drawable.searchask_1_baby_gray_icon)
            txt_user_baby.setTextColor(Color.parseColor("#d8d8d8"))
            btn_user_adult.setImageResource(R.drawable.searchask_1_adult_red_icon)
            txt_user_adult.setTextColor(Color.parseColor("#eb5f4c"))
            btn_user_oldman.setImageResource(R.drawable.searchask_1_oldman_gray_icon)
            txt_user_oldman.setTextColor(Color.parseColor("#d8d8d8"))
            if (ll_user_male.isSelected == true || ll_user_female.isSelected == true)
            {
                btn_user_next.visibility = View.VISIBLE
            }
        }
        // 중년 클릭시
        ll_user_oldman.setOnClickListener {
            age = "o"
            ll_user_oldman.isSelected = true
            btn_user_baby.setImageResource(R.drawable.searchask_1_baby_gray_icon)
            txt_user_baby.setTextColor(Color.parseColor("#d8d8d8"))
            btn_user_adult.setImageResource(R.drawable.searchask_1_adult_gray_icon)
            txt_user_adult.setTextColor(Color.parseColor("#d8d8d8"))
            btn_user_oldman.setImageResource(R.drawable.searchask_1_oldman_red_icon)
            txt_user_oldman.setTextColor(Color.parseColor("#eb5f4c"))
            if (ll_user_male.isSelected == true || ll_user_female.isSelected == true)
            {
                btn_user_next.visibility = View.VISIBLE
            }
        }

        // 다음 버튼 누르면
        btn_user_next.setOnClickListener {
            Log.e("보내기", "보내기")

            val intent = Intent(this, StyleActivity::class.java)
            intent.putExtra("sex", sex)
            intent.putExtra("age", age)
            startActivityForResult(intent, 0)
            Log.v("보내기성공?", "보내기성공?")
        }

        // 닫기 누르면
        btn_survey_close.setOnClickListener {
            finish()
        }
    }
}
