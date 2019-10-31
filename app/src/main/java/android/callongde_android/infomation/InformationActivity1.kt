package android.callongde_android.infomation

import android.callongde_android.R
import android.callongde_android.util.BaseActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information1.*

class InformationActivity1 : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information1)

        btn_info1_back.setOnClickListener {
            finish()
        }
    }
}
