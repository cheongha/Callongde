package android.callongde_android.explainapp.adapter

import android.callongde_android.explainapp.fragment.FirstExplainFragment
import android.callongde_android.explainapp.fragment.LastExplainFragment
import android.callongde_android.explainapp.fragment.SecondExplainFragment
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class ExplainPagerAdapter(fm: FragmentManager, private val num_fragment: Int) : FragmentStatePagerAdapter(fm) {

    companion object {
        private var firstExplainFragment: FirstExplainFragment? = null
        private var secondExplainFragment: SecondExplainFragment? = null
        private var lastExplainFragment: LastExplainFragment? = null

        @Synchronized
        fun getExplainFragment(): FirstExplainFragment {
            if (firstExplainFragment == null) firstExplainFragment = FirstExplainFragment()
            return firstExplainFragment!!
        }

        @Synchronized
        fun getSecondExplainFragment(): SecondExplainFragment {
            if (secondExplainFragment == null) secondExplainFragment = SecondExplainFragment()
            return secondExplainFragment!!
        }

        @Synchronized
        fun getLastExplainFragment(): LastExplainFragment {
            if (lastExplainFragment == null) lastExplainFragment = LastExplainFragment()
            return lastExplainFragment!!
        }
    }

    override fun getItem(p0: Int): Fragment? {
        return when (p0) {
            0 -> getExplainFragment()
            1 -> getSecondExplainFragment()
            2 -> getLastExplainFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return num_fragment
    }

}