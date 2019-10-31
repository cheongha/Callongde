package android.callongde_android.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class SliderHomePagerAdapter(fm: FragmentManager?, val num_fragment: Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment? {
        var fragment:SliderHomeFragment = SliderHomeFragment()
        var bundle: Bundle = Bundle(1)
        when(p0){
            0-> bundle.putString("background_url","https://1.bp.blogspot.com/-luFO8icRLq4/XZAa7qQeLzI/AAAAAAAABPE/Ib0d78djfLYgMx0Qa3ctekaxn8Ji98afwCNcBGAsYHQ/s320/home_event_1.png")
            1-> bundle.putString("background_url","https://1.bp.blogspot.com/-THDav_7-lIc/XZAa7s3X3DI/AAAAAAAABPI/4UObeTvz6GwAK3SAtnm_Z7iNkB1wIWxVgCNcBGAsYHQ/s320/home_event_2.png")
            2-> bundle.putString("background_url","https://1.bp.blogspot.com/-xNiWTR9aoOA/XZAa7i1BlSI/AAAAAAAABPA/Zl2Y3tNrjyYgJeyaurPFQo-HpcIwR1mSwCNcBGAsYHQ/s320/home_event_3.png")
        }
        fragment.arguments = bundle
        return fragment
    }

    override fun getCount(): Int {
        return num_fragment
    }
}