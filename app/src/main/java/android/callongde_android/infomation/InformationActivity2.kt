package android.callongde_android.infomation

import android.callongde_android.R
import android.callongde_android.util.BaseActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information2.*

class InformationActivity2 : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information2)

        vp_info2_moring.adapter= Info2MorningPagerAdapter(supportFragmentManager, 3 )
        vp_info2_moring.offscreenPageLimit=2

        vp_info2_afternoon.adapter= Info2AfternoonPagerAdapter(supportFragmentManager, 3 )
        vp_info2_afternoon.offscreenPageLimit=2

        vp_info2_evening.adapter= Info2EveningPagerAdapter(supportFragmentManager, 3 )
        vp_info2_evening.offscreenPageLimit=2

        btn_info2_back.setOnClickListener {
            finish()
        }
    }


}
