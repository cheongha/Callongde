package android.callongde_android.mysharon

import android.callongde_android.R
import android.callongde_android.choose.ChooseActivity
import android.callongde_android.util.BaseActivity
import android.callongde_android.util.MyDBHandler
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_my_sharon.*
import org.jetbrains.anko.ctx

class MySharonActivity : BaseActivity() {


    lateinit var mySharonOverviewRecyclerViewAdapter: MySharonOverviewRecyclerViewAdapter
    val dataList: ArrayList<MySharonOverviewData> by lazy {
        ArrayList<MySharonOverviewData>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_sharon)

        setOnClickListner()
        setrecyclerview()

        postItemId()
    }

    private fun setrecyclerview() {
        // 한복 옷 리싸이클러

        val dbHandler = MyDBHandler(this, null, null, 6)

        var listOfData: ArrayList<MySharonOverviewData> = dbHandler.findMyPickProduct(1)

        mySharonOverviewRecyclerViewAdapter = MySharonOverviewRecyclerViewAdapter(this, listOfData)
        rv_mysharon_overview_list.adapter = mySharonOverviewRecyclerViewAdapter
        rv_mysharon_overview_list.layoutManager = GridLayoutManager(this, 3)
    }

    private fun setOnClickListner() {
        btn_mysharon_back.setOnClickListener {
            finish()
        }
    }

    private fun postItemId() {


    }
}
