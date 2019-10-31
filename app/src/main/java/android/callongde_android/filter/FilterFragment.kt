package android.callongde_android.filter

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.callongde_android.R
import android.callongde_android.filter.Data.FilterContentData
import android.callongde_android.filter.Data.FilterOverviewData
import android.callongde_android.mysharon.MySharonActivity
import android.callongde_android.util.MyDBHandler
import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_filter.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.support.v4.startActivity

class FilterFragment : Fragment() {
    lateinit var filterOverviewRecyclerViewAdapter: FilterOverviewRecyclerViewAdapter
    val dataList: ArrayList<FilterOverviewData> by lazy {
        ArrayList<FilterOverviewData>()
    }
    lateinit var filterContentRecyclerViewAdapter: FilterContentRecyclerViewAdapter
    val filtercontentdataList: ArrayList<FilterContentData> by lazy {
        ArrayList<FilterContentData>()
    }

    private var flag = ArrayList<String>()


    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_filter, container, false)

        //flag = arguments!!.getStringArrayList("filterFlag")

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setContent()
        setOnBtnClickListener()
    }

    /*override fun onPause() {
        super.onPause()
        setOnBtnClickListener()
    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDetach(){
        flag = arguments!!.getStringArrayList("filterFlag")
    }
*/
    private fun setContent() {
        // 한복 옷 리싸이클러
        val dbHandler = MyDBHandler(context!!, null, null, 6)

        var listOfData: ArrayList<FilterOverviewData> = dbHandler.listOfFilter()

        filterOverviewRecyclerViewAdapter = FilterOverviewRecyclerViewAdapter(context!!, listOfData)
        rv_filter_overview_list.adapter = filterOverviewRecyclerViewAdapter
        rv_filter_overview_list.layoutManager = GridLayoutManager(context!!, 2)


        /*flag.add("경복궁")
        flag.add("그만")
*/


        if(flag != null) {
            filterContentRecyclerViewAdapter = FilterContentRecyclerViewAdapter(context!!, flag)
            rv_filter_content_list.adapter = filterContentRecyclerViewAdapter
            rv_filter_content_list.layoutManager =
                LinearLayoutManager(context!!, LinearLayoutManager.HORIZONTAL, false)
        }
        else {
            rv_filter_content_list.visibility = View.GONE
        }
    }

    private fun setOnBtnClickListener() {
        btn_sharon.setOnClickListener {
            startActivity<MySharonActivity>()
        }
    }


}
