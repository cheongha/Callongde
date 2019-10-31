package android.callongde_android.infomation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class Info3FirstPagerAdapter (fm: FragmentManager, val num_fragment1:Int):
    FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        var fragment1:Info3FirstFragment= Info3FirstFragment()
        var bundle1: Bundle = Bundle(1)
        when(p0){
            0->bundle1.putString("background_url1", "https://1.bp.blogspot.com/-KbhPux8TGxc/XZNu83OW4XI/AAAAAAAABRo/kazgLE-5PZEHkEC-zRp48l2CHSS-W2G0wCNcBGAsYHQ/s1600/info-39.png")
            1->bundle1.putString("background_url1", "https://1.bp.blogspot.com/-Ip8zav1j4LU/XZPkFXbbCEI/AAAAAAAABTk/dVOOjO7zVd4LVa4SjTaLVSPNBw-Kc6H6wCNcBGAsYHQ/s1600/info-37.png")
            2->bundle1.putString("background_url1", "https://1.bp.blogspot.com/-98bBgM3F2QQ/XZNu81H4LrI/AAAAAAAABRk/bCawdt-OCrQipbaQa_eVAooyd4JDiWnLACNcBGAsYHQ/s1600/info-38.png")
        }
        fragment1.arguments=bundle1
        return fragment1

    }

    override fun getCount(): Int {
        return num_fragment1
    }
}