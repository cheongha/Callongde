package android.callongde_android.infomation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class Info2EveningPagerAdapter (fm: FragmentManager, val num_fragment_info2_3:Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var fragment3:EndContentFragment= EndContentFragment()
        var bundle3:Bundle= Bundle(1)
        when(p0){
            0->bundle3.putString("background_url3","https://1.bp.blogspot.com/-BbLvcS0Pwic/XZNvSLm3DqI/AAAAAAAABSw/1bCDO0qa55YakolBb71-kz7E_4tE72x-ACNcBGAsYHQ/s1600/info-52.png")
            1->bundle3.putString("background_url3","https://1.bp.blogspot.com/-S6IyW7xIu68/XZNvSSKGhxI/AAAAAAAABS0/cSzrMaTqp-MlqPQnYazOfHTP7UWRF0wzwCNcBGAsYHQ/s1600/info-53.png")
            2->bundle3.putString("background_url3","https://1.bp.blogspot.com/-8JM4yDMjKOA/XZNvS6lQqrI/AAAAAAAABS4/EwYKk2lm0D0M8WiYSbSFlNbgQVHKgSDswCNcBGAsYHQ/s1600/info-54.png")
        }
        fragment3.arguments=bundle3
        return fragment3
    }

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return num_fragment_info2_3
    }
}