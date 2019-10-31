package android.callongde_android.infomation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class Info3SecondPagerAdapter(fm: FragmentManager, val num_fragment2:Int):
    FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        val fragment2:Info3SecondFragment= Info3SecondFragment()
        val bundle2: Bundle = Bundle(1)
        when(p0){
            0->bundle2.putString("background_url2", "https://1.bp.blogspot.com/-JfHTICbMvzo/XZNu9DUslTI/AAAAAAAABRs/SVKIn4tOFFYivurkeUqoUD1pJj5x402kwCNcBGAsYHQ/s1600/info-40.png")
            1->bundle2.putString("background_url2", "https://1.bp.blogspot.com/-QmYyeWRcMzc/XZNu-BSW2OI/AAAAAAAABRw/t4OH1HDlpVcQNNx8e4LAFQpArECP9D8egCNcBGAsYHQ/s1600/info-41.png")
            2->bundle2.putString("background_url2", "https://1.bp.blogspot.com/-LC1gBTU_9tI/XZNu-TpJ3oI/AAAAAAAABR0/tRBvPjByrJEcn2Rvx4bT56Yb6iYz7OdEgCNcBGAsYHQ/s1600/info-42.png")
        }
        fragment2.arguments=bundle2
        return fragment2
    }

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return num_fragment2
    }

}