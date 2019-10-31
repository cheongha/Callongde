package android.callongde_android.infomation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class Info2MorningPagerAdapter (fm: FragmentManager, val num_fragment_info2_1:Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var fragment1:FirstContentFragment = FirstContentFragment()
        var bundle1: Bundle = Bundle(1)
        when(p0){
            0->bundle1.putString("background_url1","https://1.bp.blogspot.com/-Pxqk3bmNgT0/XZNvQcJHRRI/AAAAAAAABSg/UurOPaU0Pck_nMahCmgtGFO6P1EeOcFnwCNcBGAsYHQ/s1600/info-46.png")
            1->bundle1.putString("background_url1","https://1.bp.blogspot.com/-cQv-DXa3hMo/XZNvQPS1IDI/AAAAAAAABSY/Lj8u4pwKVUk_O-5AJFFcHmM2VFJ4tS4BwCNcBGAsYHQ/s1600/info-47.png")
            2->bundle1.putString("background_url1","https://1.bp.blogspot.com/-SZ9iPX4qvP8/XZAccUj6Z7I/AAAAAAAABQE/rNt4r2np5bAfzEV4p_FMk-PA2fFj7ZlhgCNcBGAsYHQ/s1600/place-6.png")
        }
        fragment1.arguments=bundle1
        return fragment1
    }

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return num_fragment_info2_1
    }

}