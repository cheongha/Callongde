package android.callongde_android.survey

import android.app.Activity
import android.callongde_android.R
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_feel.*

class FeelActivity : AppCompatActivity() {

    var feel: String = "null"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_feel)

        var sex = intent.getStringExtra("sex")
        var age = intent.getStringExtra("age")
        var style = intent.getStringExtra("style")
        userStyle(sex, age, style)
        setOnClickListner()
    }

    private fun userStyle(sex:String, age:String, style:String) {
        if (sex == "m" && age == "b" && style == "t"){
            img_feel_simple.setImageResource(R.drawable.m_baby_tradi_ele)
            img_feel_fancy.setImageResource(R.drawable.m_baby_tradi_show)
        }
        if (sex == "m" && age == "a" && style == "t"){
            img_feel_simple.setImageResource(R.drawable.m_ad_tradi_ele)
            img_feel_fancy.setImageResource(R.drawable.m_ad_tradi_show)
        }
        if (sex == "m" && age == "o" && style == "t"){
            img_feel_simple.setImageResource(R.drawable.m_old_tradi_ele)
            img_feel_fancy.setImageResource(R.drawable.m_old_tradi_show)
        }
        if (sex == "f" && age == "b" && style == "t"){
            img_feel_simple.setImageResource(R.drawable.w_baby_tradi_ele)
            img_feel_fancy.setImageResource(R.drawable.w_baby_tradi_show)
        }
        if (sex == "f" && age == "a" && style == "t"){
            img_feel_simple.setImageResource(R.drawable.w_ad_tradi_ele)
            img_feel_fancy.setImageResource(R.drawable.w_ad_tradi_show)
        }
        if (sex == "f" && age == "o" && style == "t"){
            img_feel_simple.setImageResource(R.drawable.w_old_tradi_ele)
            img_feel_fancy.setImageResource(R.drawable.w_old_tradi_show)
        }
        if (sex == "m" && age == "b" && style == "m"){
            img_feel_simple.setImageResource(R.drawable.m_baby_modern_ele)
            img_feel_fancy.setImageResource(R.drawable.m_baby_modern_show)
        }
        if (sex == "m" && age == "a" && style == "m"){
            img_feel_simple.setImageResource(R.drawable.m_ad_modern_ele)
            img_feel_fancy.setImageResource(R.drawable.m_ad_modern_show)
        }
        if (sex == "m" && age == "o" && style == "m"){
            img_feel_simple.setImageResource(R.drawable.m_old_modern_ele)
            img_feel_fancy.setImageResource(R.drawable.m_old_modern_show)
        }
        if (sex == "f" && age == "b" && style == "m"){
            img_feel_simple.setImageResource(R.drawable.w_baby_modern_ele)
            img_feel_fancy.setImageResource(R.drawable.w_baby_modern_show)
        }
        if (sex == "f" && age == "a" && style == "m"){
            img_feel_simple.setImageResource(R.drawable.w_ad_modern_ele)
            img_feel_fancy.setImageResource(R.drawable.w_ad_modern_show)
        }
        if (sex == "f" && age == "o" && style == "m"){
            img_feel_simple.setImageResource(R.drawable.w_old_modern_ele)
            img_feel_fancy.setImageResource(R.drawable.w_old_modern_show)
        }
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
        btn_feel_back.setOnClickListener {
            finish()
        }
        btn_feel_close.setOnClickListener {
            val intent = intent
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        btn_feel_simple.setOnClickListener {
            feel = "s"
            var sex:String = intent.getStringExtra("sex")
            var age:String = intent.getStringExtra("age")
            var style:String = intent.getStringExtra("style")
            val intent = Intent(this, PlaceActivity::class.java)
            intent.putExtra("sex", sex)
            intent.putExtra("age", age)
            intent.putExtra("style", style)
            intent.putExtra("feel", feel)

            startActivityForResult(intent, 0)
        }
        btn_feel_fancy.setOnClickListener {
            feel = "f"
            var sex:String = intent.getStringExtra("sex")
            var age:String = intent.getStringExtra("age")
            var style:String = intent.getStringExtra("style")
            val intent = Intent(this, PlaceActivity::class.java)
            intent.putExtra("sex", sex)
            intent.putExtra("age", age)
            intent.putExtra("style", style)
            intent.putExtra("feel", feel)
            startActivityForResult(intent, 0)
        }
    }


}
