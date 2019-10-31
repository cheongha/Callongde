package android.callongde_android.choose

import android.callongde_android.R
import android.callongde_android.filter.FilterOverviewRecyclerViewAdapter
import android.callongde_android.util.MyDBHandler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_choose.*
import org.jetbrains.anko.ctx
import org.jetbrains.anko.toast

class ChooseActivity : AppCompatActivity() {
    private val contactDialog by lazy {
        ContactDialog()
    }

    lateinit var chooseKeywordRecylerViewAdapter: ChooseKeywordRecylerViewAdapter
    val choosekeyworddataList: ArrayList<ChooseKeywordData> by lazy {
        ArrayList<ChooseKeywordData>()
    }

    val REQUEST_CODE_CHOOSE_ACTIVITY = 1000

    lateinit var filterOverviewRecyclerViewAdapter: FilterOverviewRecyclerViewAdapter
    lateinit var price: String
    var item_id = -1

    var hanbok_name: String = "한복 이름"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_choose)

        hanbok_name = intent.getStringExtra("hanbok_name")

        lookupProduct(hanbok_name)
        setOnClickListner()
        imgslider(hanbok_name)
        keywordRecyler(hanbok_name)
    }

    fun lookupProduct(hanbok_name: String) {
        val dbHandler = MyDBHandler(this, null, null, 6)

        val hanbok = dbHandler.findProduct(hanbok_name)

        if (hanbok != null) {
            Glide.with(this)
                .load(hanbok.market_img)
                .into(img_choose_market)

            txt_choose_hanbok_name.text = hanbok.hanbok_name.toString()
            txt_choose_market_name.text = hanbok.market_name

            if (hanbok.sharon_like == 1){
                img_choose_like_sharon.setImageResource(R.drawable.filter_sharon_orange_icon)}

            txt_choose_sale.text = hanbok.sale_percent.toString() + "%"
            txt_choose_origin_price.text = hanbok.sale_price
            txt_choose_rent_time.text = hanbok.rent_time
            txt_choose_rent_price.text = hanbok.price + "원"
            txt_choose_get_item.text = hanbok.get_item
            txt_choose_item_explain.text = hanbok.item_explain
            txt_choose_size_table.text = hanbok.size_table
            txt_choose_market_address.text = hanbok.market_address

        } else {
            toast("데이터를 불러올 수 없습니다.")
        }
    }

    fun keywordRecyler(hanbok_name: String) {
        val dbHandler = MyDBHandler(this, null, null, 6)

        val hanbok = dbHandler.findProduct(hanbok_name)

        var choosekeyworddataList: ArrayList<ChooseKeywordData> = ArrayList()
        choosekeyworddataList.add(ChooseKeywordData(1, hanbok?.keyword1.toString()))
        choosekeyworddataList.add(ChooseKeywordData(2, hanbok?.keyword2.toString()))
        choosekeyworddataList.add(ChooseKeywordData(3, hanbok?.keyword3.toString()))
        choosekeyworddataList.add(ChooseKeywordData(4, hanbok?.keyword4.toString()))
        choosekeyworddataList.add(ChooseKeywordData(5, hanbok?.keyword5.toString()))
        choosekeyworddataList.add(ChooseKeywordData(6, hanbok?.keyword6.toString()))

        chooseKeywordRecylerViewAdapter =
            ChooseKeywordRecylerViewAdapter(ctx, choosekeyworddataList)
        rv_choose_keyword_list.adapter = chooseKeywordRecylerViewAdapter
        rv_choose_keyword_list.layoutManager =
            LinearLayoutManager(ctx, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun imgslider(hanbok_name: String) {
        // 홈 프래그먼트 이미지 슬라이더
        vp_choose_img_slider.adapter = ChooseSliderPagerAdapter(this, supportFragmentManager, 3, hanbok_name)
        vp_choose_img_slider.offscreenPageLimit = 3
        tl_choose_indicator.setupWithViewPager(vp_choose_img_slider)

        val navIndicatorChooseLayout: View =
            (this.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                .inflate(R.layout.navigation_indicator_choose, null, false)

        tl_choose_indicator.getTabAt(0)!!.customView =
            navIndicatorChooseLayout.findViewById(R.id.img_nav_indicator_choose_1) as ImageView
        tl_choose_indicator.getTabAt(1)!!.customView =
            navIndicatorChooseLayout.findViewById(R.id.img_nav_indicator_choose_2) as ImageView
        tl_choose_indicator.getTabAt(2)!!.customView =
            navIndicatorChooseLayout.findViewById(R.id.img_nav_indicator_choose_3) as ImageView

        tl_choose_indicator.isEnabled = true

        tl_choose_indicator.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
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

    private fun setOnClickListner() {
        /*img_choose_like_sharon.setOnClickListener {
            img_choose_like_sharon.isSelected = !img_choose_like_sharon.isSelected
        }*/
        btn_choose_contact.setOnClickListener {
            postItemId()
        }
    }

    private fun postItemId() {
        val bundle = Bundle()
        bundle.putString("hanbok_name", hanbok_name)
        contactDialog.arguments = bundle

        contactDialog.show(supportFragmentManager, "contact dialog")
        Log.d("TAG", "contact btn clicked")
    }
}
