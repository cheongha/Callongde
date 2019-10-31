package android.callongde_android.mysharon

import android.callongde_android.R
import android.callongde_android.choose.ChooseActivity
import android.callongde_android.filter.Data.FilterOverviewData
import android.callongde_android.main.MainActivity
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.rv_item_filter_overview.*
import org.jetbrains.anko.startActivity

class MySharonOverviewRecyclerViewAdapter(var ctx: Context, var dataList: ArrayList<MySharonOverviewData>): RecyclerView.Adapter<MySharonOverviewRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_mypick_overview, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].hanbok_img1)
            .into(holder.hanbok_img)

        holder.container.setOnClickListener {
            ctx.startActivity<ChooseActivity>(
            "hanbok_name" to dataList[position].hanbok_name
            )
        }
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var container = itemView.findViewById(R.id.rl_rv_item_mysharon_overview) as RelativeLayout
        var hanbok_img = itemView.findViewById(R.id.img_rv_item_mysharon_overview_hanbok) as ImageView
    }

}