package android.callongde_android.survey

import android.app.Activity
import android.callongde_android.R
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.DialogFragment
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_place.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.startActivity



class PlaceActivity : AppCompatActivity() {

    private val loadingDialog by lazy {
        LoadingDialog()
    }

    var outcome = "null"
    var place: String = "null"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_place)

        setOnClickListner()

    }

    private fun setOutcome(sex:String, age:String, style:String, feel:String, place:String) {
        if (sex == "m" && age == "b" && style == "t" && feel == "s" && place == "p1"){
            outcome = "mbtsp1"
        }
        if (sex == "m" && age == "a" && style == "t" && feel == "s" && place == "p1"){
            outcome = "matsp1"
        }
        if (sex == "m" && age == "o" && style == "t" && feel == "s" && place == "p1"){
            outcome = "motsp1"
        }
        if (sex == "m" && age == "b" && style == "s" && feel == "s" && place == "p1"){
            outcome = "mbssp1"
        }
        if (sex == "m" && age == "a" && style == "s" && feel == "s" && place == "p1"){
            outcome = "massp1"
        }
        if (sex == "m" && age == "o" && style == "s" && feel == "s" && place == "p1"){
            outcome = "mossp1"
        }
        if (sex == "m" && age == "b" && style == "t" && feel == "f" && place == "p1"){
            outcome = "mbtfp1"
        }
        if (sex == "m" && age == "a" && style == "t" && feel == "f" && place == "p1"){
            outcome = "matfp1"
        }
        if (sex == "m" && age == "o" && style == "t" && feel == "f" && place == "p1"){
            outcome = "motfp1"
        }
        if (sex == "m" && age == "b" && style == "s" && feel == "f" && place == "p1"){
            outcome = "mbsfp1"
        }
        if (sex == "m" && age == "a" && style == "s" && feel == "f" && place == "p1"){
            outcome = "masfp1"
        }
        if (sex == "m" && age == "o" && style == "s" && feel == "f" && place == "p1"){
            outcome = "mosfp1"
        }
        if (sex == "m" && age == "b" && style == "t" && feel == "s" && place == "p2"){
            outcome = "mbtsp2"
        }
        if (sex == "m" && age == "a" && style == "t" && feel == "s" && place == "p2"){
            outcome = "matsp2"
        }
        if (sex == "m" && age == "o" && style == "t" && feel == "s" && place == "p2"){
            outcome = "motsp2"
        }
        if (sex == "m" && age == "b" && style == "s" && feel == "s" && place == "p2"){
            outcome = "mbssp2"
        }
        if (sex == "m" && age == "a" && style == "s" && feel == "s" && place == "p2"){
            outcome = "massp2"
        }
        if (sex == "m" && age == "o" && style == "s" && feel == "s" && place == "p2"){
            outcome = "mossp2"
        }
        if (sex == "m" && age == "b" && style == "t" && feel == "f" && place == "p2"){
            outcome = "mbtfp2"
        }
        if (sex == "m" && age == "a" && style == "t" && feel == "f" && place == "p2"){
            outcome = "matfp2"
        }
        if (sex == "m" && age == "o" && style == "t" && feel == "f" && place == "p2"){
            outcome = "motfp2"
        }
        if (sex == "m" && age == "b" && style == "s" && feel == "f" && place == "p2"){
            outcome = "mbsfp2"
        }
        if (sex == "m" && age == "a" && style == "s" && feel == "f" && place == "p2"){
            outcome = "masfp2"
        }
        if (sex == "m" && age == "o" && style == "s" && feel == "f" && place == "p2"){
            outcome = "mosfp2"
        }


        if (sex == "f" && age == "b" && style == "t" && feel == "s" && place == "p1"){
            outcome = "fbtsp1"
        }
        if (sex == "f" && age == "a" && style == "t" && feel == "s" && place == "p1"){
            outcome = "fatsp1"
        }
        if (sex == "f" && age == "o" && style == "t" && feel == "s" && place == "p1"){
            outcome = "fotsp1"
        }
        if (sex == "f" && age == "b" && style == "s" && feel == "s" && place == "p1"){
            outcome = "fbssp1"
        }
        if (sex == "f" && age == "a" && style == "s" && feel == "s" && place == "p1"){
            outcome = "fassp1"
        }
        if (sex == "f" && age == "o" && style == "s" && feel == "s" && place == "p1"){
            outcome = "fossp1"
        }
        if (sex == "f" && age == "b" && style == "t" && feel == "f" && place == "p1"){
            outcome = "fbtfp1"
        }
        if (sex == "f" && age == "a" && style == "t" && feel == "f" && place == "p1"){
            outcome = "fatfp1"
        }
        if (sex == "f" && age == "o" && style == "t" && feel == "f" && place == "p1"){
            outcome = "fotfp1"
        }
        if (sex == "f" && age == "b" && style == "s" && feel == "f" && place == "p1"){
            outcome = "fbssp1"
        }
        if (sex == "f" && age == "a" && style == "s" && feel == "f" && place == "p1"){
            outcome = "fasfp1"
        }
        if (sex == "f" && age == "o" && style == "s" && feel == "f" && place == "p1"){
            outcome = "fosfp1"
        }
        if (sex == "f" && age == "b" && style == "t" && feel == "s" && place == "p2"){
            outcome = "fbtsp2"
        }
        if (sex == "f" && age == "a" && style == "t" && feel == "s" && place == "p2"){
            outcome = "fatsp2"
        }
        if (sex == "m" && age == "o" && style == "t" && feel == "s" && place == "p2"){
            outcome = "fotsp2"
        }
        if (sex == "f" && age == "b" && style == "s" && feel == "s" && place == "p2"){
            outcome = "fbssp2"
        }
        if (sex == "f" && age == "a" && style == "s" && feel == "s" && place == "p2"){
            outcome = "fassp2"
        }
        if (sex == "f" && age == "o" && style == "s" && feel == "s" && place == "p2"){
            outcome = "fossp2"
        }
        if (sex == "f" && age == "b" && style == "t" && feel == "f" && place == "p2"){
            outcome = "fbtfp2"
        }
        if (sex == "f" && age == "a" && style == "t" && feel == "f" && place == "p2"){
            outcome = "fatfp2"
        }
        if (sex == "f" && age == "o" && style == "t" && feel == "f" && place == "p2"){
            outcome = "fotfp2"
        }
        if (sex == "f" && age == "b" && style == "s" && feel == "f" && place == "p2"){
            outcome = "fbsfp2"
        }
        if (sex == "f" && age == "a" && style == "s" && feel == "f" && place == "p2"){
            outcome = "fasfp2"
        }
        if (sex == "f" && age == "o" && style == "s" && feel == "f" && place == "p2"){
            outcome = "fosfp2"
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
        btn_place_back.setOnClickListener {
            finish()
        }
        btn_place_close.setOnClickListener {
            val intent = intent
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        btn_place1.setOnClickListener {
            place = "p1"
            btn_place1.setImageResource(R.drawable.searchask_3_marking_red_icon)
            btn_place2.setImageResource(R.drawable.searchask_3_marking_gray_icon)
            btn_place_next.visibility = View.VISIBLE
        }
        btn_place2.setOnClickListener {
            place = "p2"
            btn_place1.setImageResource(R.drawable.searchask_3_marking_gray_icon)
            btn_place2.setImageResource(R.drawable.searchask_3_marking_red_icon)
            btn_place_next.visibility = View.VISIBLE
        }

        btn_place_next.setOnClickListener {
            loadingDialog.setStyle(DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Holo_Light)

            loadingDialog.show(supportFragmentManager, "tag")

            Handler().postDelayed({
                var sex:String = intent.getStringExtra("sex")
                var age:String = intent.getStringExtra("age")
                var style:String = intent.getStringExtra("style")
                var feel:String = intent.getStringExtra("feel")
                setOutcome(sex, age, style, feel, place)


                val intent = Intent(this, OutcomeActivity::class.java)
                intent.putExtra("outcome", outcome)

                startActivityForResult(intent, 0)

                setResult(Activity.RESULT_OK, intent)
                finish()
            }, 4000)


        }




    }
}
