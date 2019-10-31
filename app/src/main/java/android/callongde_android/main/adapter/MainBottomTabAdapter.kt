package android.callongde_android.main.adapter

import android.callongde_android.filter.FilterFragment
import android.callongde_android.home.HomeFragment
import android.callongde_android.info.InfoFragment
import android.callongde_android.etc.MypageFragment
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MainBottomTabAdapter(fm: FragmentManager, private val num_fragment: Int) : FragmentStatePagerAdapter(fm) {

    companion object {
        private var homeFragment: HomeFragment? = null
        private var filterFragment: FilterFragment? = null
        private var infoFragment: InfoFragment? = null
        private var mypageFragment: MypageFragment? = null

        @Synchronized
        fun getHomeFragment(): HomeFragment {
            if (homeFragment == null) homeFragment = HomeFragment()
            return homeFragment!!
        }

        @Synchronized
        fun getFilterFragment(): FilterFragment {
            if (filterFragment == null) filterFragment = FilterFragment()
            return filterFragment!!
        }

        @Synchronized
        fun getInfoFragment(): InfoFragment {
            if (infoFragment == null) infoFragment = InfoFragment()
            return infoFragment!!
        }

        @Synchronized
        fun getMypageFragment(): MypageFragment {
            if (mypageFragment == null) mypageFragment = MypageFragment()
            return mypageFragment!!
        }
    }

    override fun getItem(p0: Int): Fragment? {
        return when (p0) {
            0 -> getHomeFragment()
            1 -> getFilterFragment()
            2 -> getInfoFragment()
            3 -> getMypageFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return num_fragment
    }

}
