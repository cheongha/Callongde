package android.callongde_android.filter

import android.callongde_android.R
import android.callongde_android.choose.ChooseActivity
import android.callongde_android.filter.Data.FilterOverviewData
import android.callongde_android.main.MainActivity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.rv_item_filter_overview.*
import org.jetbrains.anko.startActivity

class FilterOverviewRecyclerViewAdapter(var ctx: Context, var dataList: ArrayList<FilterOverviewData>): RecyclerView.Adapter<FilterOverviewRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_filter_overview, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].hanbok_img)
            .into(holder.hanbok_img)
        holder.hanbok_name.text = dataList[position].hanbok_name
        holder.market_name.text = dataList[position].market_name
        holder.rent_time.text = dataList[position].rent_time.toString()
        holder.price.text = dataList[position].price

        if (dataList[position].like_sharon == 1){
            holder.like_sharon.isSelected = true
        }

        holder.like_sharon.setOnClickListener{
            holder.like_sharon.isSelected = !holder.like_sharon.isSelected
            if (dataList[position].like_sharon == 1){
                dataList[position].like_sharon = 0
            }
            else {
                dataList[position].like_sharon = 1
            }

        }

        holder.container.setOnClickListener {
            ctx.startActivity<ChooseActivity>(
                "hanbok_name" to dataList[position].hanbok_name,
                "market_name" to dataList[position].market_name,
                "rent_time" to dataList[position].rent_time,
                "price" to dataList[position].price,
                "like_sharon" to dataList[position].like_sharon,
                "item_id" to dataList[position].item_id
            )
        }
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var container = itemView.findViewById(R.id.ll_rv_item_filter_overview) as LinearLayout
        var hanbok_img = itemView.findViewById(R.id.img_rv_item_filter_overview_hanbok) as ImageView
        var hanbok_name = itemView.findViewById(R.id.txt_rv_item_filter_overview_hanbok_name) as TextView
        var market_name = itemView.findViewById(R.id.txt_rv_item_filter_overview_market_name) as TextView
        var rent_time = itemView.findViewById(R.id.txt_rv_item_filter_overview_rent_time) as TextView
        var price = itemView.findViewById(R.id.txt_rv_item_filter_overview_price) as TextView
        var like_sharon = itemView.findViewById(R.id.img_rv_item_filter_overview_like_sharon) as ImageView
    }

}