package android.callongde_android.search

import android.callongde_android.R
import android.callongde_android.util.BaseActivity
import android.callongde_android.util.MyDBHandler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_find.*
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {
    lateinit var searchOverviewRecyclerViewAdapter: SearchOverviewRecyclerViewAdapter
    val dataList: ArrayList<SearchData> by lazy {
        ArrayList<SearchData>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        btn_search_search.setOnClickListener {
            setOverView()
        }
        setOnClickListner()
    }

    private fun setOverView() {
        val dbHandler = MyDBHandler(this, null, null, 6)
        var hanbok_name: String = txt_search_word.text.toString()
        var listOfData: ArrayList<SearchData> = dbHandler.findSearchProduct(hanbok_name)

        if (listOfData != null) {
            search_outcome.visibility = View.VISIBLE
            search_hanbok.visibility = View.INVISIBLE
            searchOverviewRecyclerViewAdapter = SearchOverviewRecyclerViewAdapter(this, listOfData)
            rv_search_overview_list.adapter = searchOverviewRecyclerViewAdapter
            rv_search_overview_list.layoutManager = GridLayoutManager(this, 2)

        } else {
            search_outcome.visibility = View.INVISIBLE
            search_hanbok.visibility = View.INVISIBLE
            search_no_outcome.visibility = View.VISIBLE
        }
    }


    private fun setOnClickListner() {
        btn_search_back.setOnClickListener {
            finish()
        }
    }
}
