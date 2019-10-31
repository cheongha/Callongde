package android.callongde_android.survey.surveyoutcome

import android.callongde_android.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.callongde_android.choose.ChooseActivity
import android.callongde_android.survey.OutcomeActivity
import android.content.Context
import android.content.Intent
import android.util.Log
import kotlinx.android.synthetic.main.fragment_outcome_fragment1.*
import android.widget.ImageView
import com.bumptech.glide.Glide
import org.jetbrains.anko.support.v4.find


class OutcomeFragment1 : Fragment() {

    val hanbok_name = "우리의"
    private var outcome = ""

    override fun onAttach(context: Context?) {
        super.onAttach(context)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*outcome = arguments!!.getString("outcome")
        Log.e("outcome", outcome)*/
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_outcome_fragment1, container, false)

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /*val Img_url:String = arguments!!.getString("background_url")

        Glide.with(this)
            .load(Img_url)
            .into(img_outcome1)*/


        setOnBtnClickListener()

    }

    private fun setOnBtnClickListener() {
        img_outcome1.setOnClickListener {

            postItemId()

            // 앞에 쌓인 액티비티 꺼주기
            (activity as OutcomeActivity).finish()

            activity?.setResult(-101)
            activity?.finish()
            Log.v("tag","123456")
        }
    }

    private fun postItemId() {
        val intent = Intent(activity, ChooseActivity::class.java)
        intent.putExtra("hanbok_name", hanbok_name)
        startActivity(intent)
    }

}