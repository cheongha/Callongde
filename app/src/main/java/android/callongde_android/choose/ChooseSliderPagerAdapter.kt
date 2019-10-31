package android.callongde_android.choose

import android.callongde_android.util.MyDBHandler
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class ChooseSliderPagerAdapter(val context: Context, fm: FragmentManager?, val num_fragment: Int, val hanbok_name: String): FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment? {

        val dbHandler = MyDBHandler(context, null, null, 6)

        val hanbok = dbHandler.findProduct(hanbok_name)

        var fragmentSlider:SliderChooseFragment = SliderChooseFragment()
        var bundle: Bundle = Bundle(1)
        when(p0){
            0-> bundle.putString("background_url", hanbok?.hanbok_img1.toString())
            1-> bundle.putString("background_url", hanbok?.hanbok_img2.toString())
            2-> bundle.putString("background_url", hanbok?.hanbok_img3.toString())
        }
        fragmentSlider.arguments = bundle
        return fragmentSlider
    }

    override fun getCount(): Int {
        return num_fragment
    }
}