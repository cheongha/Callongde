package android.callongde_android.home

import android.callongde_android.R
import android.callongde_android.choose.ChooseActivity
import android.callongde_android.home.Data.HomeOverviewData
import android.callongde_android.main.MainActivity
import android.callongde_android.util.MyDBHandler
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.startActivity

class HomeMarketRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<HomeOverviewData>):

    RecyclerView.Adapter<HomeMarketRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.rv_item_home_market, p0, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        Glide.with(ctx)
            .load(dataList[position].hanbok_img1)
            .into(holder.hanbok_img)
        Glide.with(ctx)
            .load(dataList[position].market_img)
            .into(holder.market_img)
        holder.hanbok_name.text = dataList[position].hanbok_name.toString()
        holder.market_name.text = dataList[position].market_name.toString()
        holder.keyword1.text = dataList[position].keyword1.toString()
        holder.keyword2.text = dataList[position].keyword3.toString()
        holder.keyword3.text = dataList[position].keyword3.toString()

        if (dataList[position].sale_yesno == 1){
            holder.sale.visibility = View.VISIBLE
        }

        holder.container.setOnClickListener {
            ctx.startActivity<ChooseActivity>(
                "hanbok_name" to dataList[position].hanbok_name
            )
        }
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var container = itemView.findViewById(R.id.rl_rv_item_home_market_container) as RelativeLayout
        var hanbok_img = itemView.findViewById(R.id.img_rv_item_home_market_hanbok_img) as ImageView
        var market_img = itemView.findViewById(R.id.img_rv_item_home_market_market_img) as ImageView
        var hanbok_name = itemView.findViewById(R.id.txt_rv_item_home_market_hanbok_name) as TextView
        var market_name = itemView.findViewById(R.id.txt_rv_item_home_market_market_name) as TextView
        var keyword1 = itemView.findViewById(R.id.txt_rv_item_home_market_keyword1) as TextView
        var keyword2 = itemView.findViewById(R.id.txt_rv_item_home_market_keyword2) as TextView
        var keyword3 = itemView.findViewById(R.id.txt_rv_item_home_market_keyword3) as TextView
        var sharon_like_num = itemView.findViewById(R.id.txt_rv_item_home_market_sharon_like) as TextView
        var sale = itemView.findViewById(R.id.img_rv_item_home_market_sale_yesno) as ImageView
    }

}