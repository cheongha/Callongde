package android.callongde_android.splash

import android.callongde_android.R
import android.callongde_android.explainapp.ExplainAppActivity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    // 스플래쉬를 보여주는 시간
    val SPLASH_TIME_OUT: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_splash)

        // 스플래쉬를 유지하는 핸들러
        Handler().postDelayed({

            // SPLASH_TIME_OUT초 뒤에 하는 동작
            startActivity(Intent(this, ExplainAppActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}

