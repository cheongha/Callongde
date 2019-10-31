package android.callongde_android.notice

import android.callongde_android.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_notice.*

class NoticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice)

        setOnClickListner()
    }

    private fun setOnClickListner() {
        btn_notice_close.setOnClickListener {
            finish()
        }
    }
}
