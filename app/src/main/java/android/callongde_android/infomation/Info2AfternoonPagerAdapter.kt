package android.callongde_android.infomation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class Info2AfternoonPagerAdapter (fm: FragmentManager, val num_fragment_info2_2:Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var fragment2:SecondContentFragment= SecondContentFragment()
        var bundle2: Bundle =Bundle(1)
        when(p0){
            0->bundle2.putString("background_url2", "https://1.bp.blogspot.com/-sy_MKcW72Ps/XZNvRZCcjjI/AAAAAAAABSk/rWZj0HJhZwcftzJsaVxE7SBO1DHeVtvfQCNcBGAsYHQ/s1600/info-49.png")
            1->bundle2.putString("background_url2", "https://1.bp.blogspot.com/-6SXPsBglZLM/XZNvRh1NhoI/AAAAAAAABSo/tQxrD7Hlx80ot_-CjoscYs-t9cr-nAsPwCNcBGAsYHQ/s1600/info-50.png")
            2->bundle2.putString("background_url2", "https://1.bp.blogspot.com/-rKwHl6I4V5g/XZNvR5HxrDI/AAAAAAAABSs/MEOMNkkfAtYUDWRT1pAu3MeE2uut2EdLACNcBGAsYHQ/s1600/info-51.png")
        }
        fragment2.arguments=bundle2
        return fragment2
    }

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return num_fragment_info2_2
    }
}