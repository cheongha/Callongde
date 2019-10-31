package android.callongde_android.explainapp

import android.callongde_android.R
import android.callongde_android.explainapp.adapter.ExplainPagerAdapter
import android.callongde_android.util.BaseActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explain_app.*

class ExplainAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_explain_app)


        configure()
    }

    // 어댑터와 뷰페이저 연결하기
    private fun configure() {
        vp_explain.adapter = ExplainPagerAdapter(supportFragmentManager, 3)
        vp_explain.offscreenPageLimit = 2
    }

}
