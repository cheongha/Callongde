package android.callongde_android.survey

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_style.*
import android.callongde_android.R
import android.app.Activity
import android.util.Log


class StyleActivity : AppCompatActivity() {

    var style: String = "null"

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_style)

        var sex:String = intent.getStringExtra("sex")
        var age:String = intent.getStringExtra("age")
        Log.v("성공?", "성공?")
        userIfFilter(sex, age)

        setOnClickListner()
    }

    private fun userIfFilter(sex:String, age:String) {
        if (sex == "m" && age == "b"){
            img_style_tradition.setImageResource(R.drawable.m_baby_tradi)
            img_style_modern.setImageResource(R.drawable.m_baby_modern)
        }
        if (sex == "m" && age == "a"){
            img_style_tradition.setImageResource(R.drawable.m_ad_tradi)
            img_style_modern.setImageResource(R.drawable.m_ad_modern)
        }
        if (sex == "m" && age == "o"){
            img_style_tradition.setImageResource(R.drawable.m_old_tradi)
            img_style_modern.setImageResource(R.drawable.m_old_modern)
        }
        if (sex == "f" && age == "b"){
            img_style_tradition.setImageResource(R.drawable.w_baby_tradi)
            img_style_modern.setImageResource(R.drawable.w_baby_modern)
        }
        if (sex == "f" && age == "a"){
            img_style_tradition.setImageResource(R.drawable.w_ad_tradi)
            img_style_modern.setImageResource(R.drawable.w_ad_modern)
        }
        if (sex == "f" && age == "o"){
            img_style_tradition.setImageResource(R.drawable.w_old_tradi)
            img_style_modern.setImageResource(R.drawable.w_old_modern)
        }
    }

    private fun setOnClickListner() {
        btn_style_back.setOnClickListener {
            finish()
        }
        btn_style_close.setOnClickListener {
            val intent = intent
            setResult(Activity.RESULT_OK, intent)
            finish()

        }
        btn_style_tradition.setOnClickListener {
            style = "t"
            var sex:String = intent.getStringExtra("sex")
            var age:String = intent.getStringExtra("age")

            val intent = Intent(this, FeelActivity::class.java)
            intent.putExtra("sex", sex)
            intent.putExtra("age", age)
            intent.putExtra("style", style)
            startActivityForResult(intent, 0)
        }
        btn_style_modern.setOnClickListener {
            style = "m"
            var sex:String = intent.getStringExtra("sex")
            var age:String = intent.getStringExtra("age")

            val intent = Intent(this, FeelActivity::class.java)
            intent.putExtra("sex", sex)
            intent.putExtra("age", age)
            intent.putExtra("style", style)
            startActivityForResult(intent, 0)
        }
    }
}
