package android.callongde_android.main

import android.callongde_android.R
import android.callongde_android.filter.FilterActivity
import android.callongde_android.filter.FilterFragment
import android.callongde_android.main.adapter.MainBottomTabAdapter
import android.callongde_android.search.SearchActivity
import android.callongde_android.util.BaseActivity
import android.callongde_android.util.OnSingleClickListener
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.openDatabase
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigation_category_main.*
import org.jetbrains.anko.startActivityForResult

class MainActivity : AppCompatActivity() {

    lateinit var navCategoryMainLayout: View

    private val popupDialog by lazy {
        PopupDialog()
    }

    private var filterFlag = ArrayList<String>()


    lateinit var database: SQLiteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            popupDialog.show(supportFragmentManager, " dialog")
        }, 1000)



        configureMainTab()
        setOnClickListner()

    }

    /*fun replaceFragmentFromHome(frameLayoutId: Int, fragment: Fragment, position: Int) {
        val bundle = Bundle()
        bundle.putInt("flag", position)
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .replace(frameLayoutId, fragment)
            .commit()
    }*/

    private fun setOnClickListner() {
        btn_filter_dialog.setOnClickListener {
            startActivityForResult<FilterActivity>(9)

            /*val intent = Intent(this, FilterActivity::class.java)
            startActivityForResult(intent, 0)*/

        }
        btn_search.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivityForResult(intent, 0)
        }

        /*rl_category_main_filter.setOnClickListener(object : OnSingleClickListener() {
            override fun onSingleClick(v: View) {
                replaceFragmentFromHome(R.id.vp_main, FilterFragment(), 0)
            }
        })*/
    }

    private fun openDatabase(databaseName: String) {
        database = openOrCreateDatabase(databaseName, Context.MODE_PRIVATE, null)
        Log.v("tag", "123456")
    }


    override fun onResume() {
        super.onResume()
        //filterFlag = intent.getStringArrayListExtra("filterFlag")
    }

    private fun configureMainTab() {
        vp_main.adapter = MainBottomTabAdapter(supportFragmentManager, 4)
        vp_main.offscreenPageLimit = 3
        tl_main_bottom.setupWithViewPager(vp_main)

        val navCategoryMainLayout: View = (this.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.navigation_category_main, null, false)

        tl_main_bottom.getTabAt(0)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_category_main_home) as RelativeLayout
        tl_main_bottom.getTabAt(1)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_category_main_filter) as RelativeLayout
        tl_main_bottom.getTabAt(2)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_category_main_info) as RelativeLayout
        tl_main_bottom.getTabAt(3)!!.customView = navCategoryMainLayout.
            findViewById(R.id.rl_category_main_mypage) as RelativeLayout


        setTabPagerListener()
    }

    // 하단 탭바 이동될 때, 아이콘과 텍스트 색 변경
    private fun setTabPagerListener() {

        vp_main.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {
            }
            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
                when (p0) {
                    0 -> {
                        tv_home.setTextColor(Color.parseColor("#f29a38"))
                        tv_filter.setTextColor(Color.parseColor("#828384"))
                        tv_info.setTextColor(Color.parseColor("#828384"))
                        tv_mypage.setTextColor(Color.parseColor("#828384"))
                        iv_home.setImageResource(R.drawable.main_tb_bottom_home_on_icon)
                        iv_filter.setImageResource(R.drawable.main_tb_bottom_filter_off_icon)
                        iv_info.setImageResource(R.drawable.main_tb_bottom_info_off_icon)
                        iv_etc.setImageResource(R.drawable.main_tb_bottom_etc_off_icon)
                        btn_filter_dialog.visibility = View.INVISIBLE
                        btn_search.visibility = View.VISIBLE
                    }
                    1 -> {
                        tv_home.setTextColor(Color.parseColor("#828384"))
                        tv_filter.setTextColor(Color.parseColor("#f29a38"))
                        tv_info.setTextColor(Color.parseColor("#828384"))
                        tv_mypage.setTextColor(Color.parseColor("#828384"))
                        iv_home.setImageResource(R.drawable.main_tb_bottom_home_off_icon)
                        iv_filter.setImageResource(R.drawable.main_tb_bottom_filter_on_icon)
                        iv_info.setImageResource(R.drawable.main_tb_bottom_info_off_icon)
                        iv_etc.setImageResource(R.drawable.main_tb_bottom_etc_off_icon)
                        btn_filter_dialog.visibility = View.VISIBLE
                        btn_search.visibility = View.VISIBLE
                    }
                    2 -> {
                        tv_home.setTextColor(Color.parseColor("#828384"))
                        tv_filter.setTextColor(Color.parseColor("#828384"))
                        tv_info.setTextColor(Color.parseColor("#f29a38"))
                        tv_mypage.setTextColor(Color.parseColor("#828384"))
                        iv_home.setImageResource(R.drawable.main_tb_bottom_home_off_icon)
                        iv_filter.setImageResource(R.drawable.main_tb_bottom_filter_off_icon)
                        iv_info.setImageResource(R.drawable.main_tb_bottom_info_on_icon)
                        iv_etc.setImageResource(R.drawable.main_tb_bottom_etc_off_icon)
                        btn_filter_dialog.visibility = View.INVISIBLE
                        btn_search.visibility = View.INVISIBLE
                    }
                    3 -> {
                        tv_home.setTextColor(Color.parseColor("#828384"))
                        tv_filter.setTextColor(Color.parseColor("#828384"))
                        tv_info.setTextColor(Color.parseColor("#828384"))
                        tv_mypage.setTextColor(Color.parseColor("#f29a38"))
                        iv_home.setImageResource(R.drawable.main_tb_bottom_home_off_icon)
                        iv_filter.setImageResource(R.drawable.main_tb_bottom_filter_off_icon)
                        iv_info.setImageResource(R.drawable.main_tb_bottom_info_off_icon)
                        iv_etc.setImageResource(R.drawable.main_tb_bottom_etc_on_icon)
                        btn_filter_dialog.visibility = View.INVISIBLE
                        btn_search.visibility = View.INVISIBLE
                    }
                }
            }

            override fun onPageSelected(p0: Int) {
            }

        })

    }


}
