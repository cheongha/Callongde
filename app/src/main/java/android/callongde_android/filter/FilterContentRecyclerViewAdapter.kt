package android.callongde_android.filter

import android.callongde_android.R
import android.callongde_android.filter.Data.FilterContentData
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FilterContentRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<String>):
    RecyclerView.Adapter<FilterContentRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_filter_content, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.content.text = dataList[position]
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var content = itemView.findViewById(R.id.txt_rv_item_filter_content) as TextView
    }

}