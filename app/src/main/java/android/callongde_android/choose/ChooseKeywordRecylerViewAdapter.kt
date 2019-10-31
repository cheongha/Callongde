package android.callongde_android.choose

import android.callongde_android.R
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ChooseKeywordRecylerViewAdapter(val ctx: Context, val dataList: ArrayList<ChooseKeywordData>):
    RecyclerView.Adapter<ChooseKeywordRecylerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_choose_keyword, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.keyword.text = dataList[position].keyword
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var keyword = itemView.findViewById(R.id.txt_rv_item_choose_keyword) as TextView
    }

}