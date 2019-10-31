package android.callongde_android.survey.surveyoutcome

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.bumptech.glide.Glide

class OutcomePagerAdapter(fm: FragmentManager, private val num_fragment: Int, outcome:String) : FragmentStatePagerAdapter(fm) {

    companion object {
        private var outcomeFragment1: OutcomeFragment1? = null
        private var outcomeFragment2: OutcomeFragment2? = null
        private var outcomeFragment3: OutcomeFragment3? = null



        @Synchronized
        fun getOutcomeFragment1(): OutcomeFragment1 {
            if (outcomeFragment1 == null) outcomeFragment1 = OutcomeFragment1()
            return outcomeFragment1!!
        }

        @Synchronized
        fun getOutcomeFragment2(): OutcomeFragment2 {
            if (outcomeFragment2 == null) outcomeFragment2 = OutcomeFragment2()
            return outcomeFragment2!!
        }

        @Synchronized
        fun getOutcomeFragment3(): OutcomeFragment3 {
            if (outcomeFragment3 == null) outcomeFragment3 = OutcomeFragment3()
            return outcomeFragment3!!
        }
    }

    override fun getItem(p0: Int): Fragment? {
        return when (p0) {
            0 -> {
                getOutcomeFragment1()
            }
            1 -> getOutcomeFragment2()
            2 -> getOutcomeFragment3()
            else -> null
        }
    }

    override fun getCount(): Int {
        return num_fragment
    }

}