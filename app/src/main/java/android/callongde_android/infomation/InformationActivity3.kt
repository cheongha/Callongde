package android.callongde_android.infomation

import android.callongde_android.R
import android.callongde_android.util.BaseActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information3.*

class InformationActivity3 : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information3)

        vp_info3_content1.adapter= Info3FirstPagerAdapter(supportFragmentManager, 3 )
        vp_info3_content1.offscreenPageLimit=2

        vp_info3_content2.adapter= Info3SecondPagerAdapter(supportFragmentManager, 3 )
        vp_info3_content2.offscreenPageLimit=2

        vp_info3_content3.adapter= Info3EndPagerAdapter(supportFragmentManager, 3 )
        vp_info3_content3.offscreenPageLimit=2

        btn_info3_back.setOnClickListener {
            finish()
        }
    }
}
