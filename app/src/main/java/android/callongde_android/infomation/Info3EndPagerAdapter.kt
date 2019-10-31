package android.callongde_android.infomation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class Info3EndPagerAdapter (fm: FragmentManager, val  num_fragment3:Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        var fragment3:Info3EndFragment=Info3EndFragment()
        var bundle3: Bundle = Bundle(1)
        when(p0){
            0-> bundle3.putString("background_url3", "https://1.bp.blogspot.com/-haKHf3UU0Xw/XZNu-TYs9II/AAAAAAAABR4/rbp-uWiXyZUrOWoNMMivrPW_hWZJ4pXzgCNcBGAsYHQ/s1600/info-43.png")
            1-> bundle3.putString("background_url3", "https://1.bp.blogspot.com/-xM71rwdY4yA/XZNu--b7AEI/AAAAAAAABR8/5J_KboH93fUIMo-bnFGrHXFY89BhtzZXgCNcBGAsYHQ/s1600/info-44.png")
            2-> bundle3.putString("background_url3", "https://1.bp.blogspot.com/-cGRmgmXpmkA/XZNu_yn1hsI/AAAAAAAABSA/-atHLNsZj9MZwiytC-2EJm0x3o_H2puFwCNcBGAsYHQ/s1600/info-45.png")
        }
        fragment3.arguments=bundle3
        return fragment3

    }

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return num_fragment3
    }
}