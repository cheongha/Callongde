package android.callongde_android.util

import android.callongde_android.R
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View


open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.WhiteAppTheme)

        setGrayStatusBarIcon()
    }

    fun setGrayStatusBarIcon(){
        val view: View? = window.decorView
        view!!.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
        /*view!!.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN)
        view!!.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)*/
    }
}