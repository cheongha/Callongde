package android.callongde_android.util

import android.callongde_android.R
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.search_list_item.view.*

class SearchAdapter(get_excel: MutableList<SearchData>) : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {


    //items MutableList, MutableList는 item을 추가할 수 있다.
    var items: MutableList<SearchData> = get_excel

    //뷰홀더 생성
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = SearchViewHolder(p0)

    //item 사이즈
    override fun getItemCount(): Int = items.size

    //여기서 item을 textview에 옮겨준다.
    override fun onBindViewHolder(p0: SearchViewHolder, p1: Int) {
        items[p1].let { item ->
            with(p0) {
                Fullname.text = item.fullname
                Quiz.text = item.quiz
            }
        }
    }

    inner class SearchViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.search_list_item, parent, false)) {
        val Fullname = itemView.search_fullname
        val Quiz = itemView.search_quiz
    }
}
