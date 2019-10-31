package android.callongde_android.survey

import android.app.Activity
import android.callongde_android.R
import android.callongde_android.main.MainActivity
import android.callongde_android.survey.surveyoutcome.OutcomeFragment1
import android.callongde_android.survey.surveyoutcome.OutcomePagerAdapter
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_choose.*
import kotlinx.android.synthetic.main.activity_outcome.*
import kotlinx.android.synthetic.main.activity_place.*
import kotlinx.android.synthetic.main.fragment_outcome_fragment1.*

class OutcomeActivity : AppCompatActivity() {

    private val outcomeFragment1 by lazy {
        OutcomeFragment1()
    }

    private var outcome = "null"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_outcome)

        configure()

        outcome = intent.getStringExtra("outcome")
        Log.e("outcome1111", outcome)
        setOutcome(outcome)



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

    private fun configure() {
        vp_outcome.adapter = OutcomePagerAdapter(supportFragmentManager, 3, outcome)
        vp_outcome.offscreenPageLimit = 2


        /*outcome = intent.getStringExtra("outcome")

        val bundle = Bundle()
        bundle.putString("outcome", outcome)
        outcomeFragment1.arguments = bundle*/

    }


    private fun setOutcome(outcome: String) {


        if (outcome == "mbtsp1"){
            val bundle = Bundle()
            bundle.putString("outcome", outcome)
            outcomeFragment1.arguments = bundle
        }
        /*if (sex == "m" && age == "a" && style == "t" && feel == "s" && place == "p1"){
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
        }*/
    }
}
