package android.callongde_android.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.callongde_android.R
import android.callongde_android.home.Data.HomeOverviewData
import android.callongde_android.util.MyDBHandler
import android.support.design.widget.TabLayout
import android.support.v7.widget.LinearLayoutManager
import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    lateinit var homeMarketRecyclerViewAdapter: HomeMarketRecyclerViewAdapter
    val dataList: ArrayList<HomeOverviewData> by lazy {
        ArrayList<HomeOverviewData>()
    }

    lateinit var navIndicatorHomeLayout: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val dbHandler = MyDBHandler(context!!, null, null, 6)

        var listOfData: ArrayList<HomeOverviewData> = dbHandler.listOfHome()

        homeMarketRecyclerViewAdapter = HomeMarketRecyclerViewAdapter(context!!, listOfData)
        rv_home_market_overview_list.adapter = homeMarketRecyclerViewAdapter
        rv_home_market_overview_list.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        // 홈 프래그먼트 이미지 슬라이더
        vp_home_slider.adapter = SliderHomePagerAdapter(childFragmentManager!!, 3)
        vp_home_slider.offscreenPageLimit = 3
        tl_home_indicator.setupWithViewPager(vp_home_slider)

        navIndicatorHomeLayout =
            (activity!!.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                .inflate(R.layout.navigation_indicator_home, null, false)

        tl_home_indicator.getTabAt(0)!!.customView =
            navIndicatorHomeLayout.findViewById(R.id.img_nav_indicator_home_1) as ImageView
        tl_home_indicator.getTabAt(1)!!.customView =
            navIndicatorHomeLayout.findViewById(R.id.img_nav_indicator_home_2) as ImageView
        tl_home_indicator.getTabAt(2)!!.customView =
            navIndicatorHomeLayout.findViewById(R.id.img_nav_indicator_home_3) as ImageView

        tl_home_indicator.isEnabled = true

        tl_home_indicator.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
                p0!!.customView!!.setBackgroundResource(R.drawable.white_circle_border)
            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                p0!!.customView!!.setBackgroundResource(R.drawable.orange_circle_border)

            }
        })
    }
}