package android.callongde_android.explainapp.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.callongde_android.R
import android.callongde_android.explainapp.ExplainAppActivity
import android.callongde_android.main.MainActivity
import kotlinx.android.synthetic.main.fragment_last_explain.*
import org.jetbrains.anko.support.v4.startActivity

class LastExplainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_last_explain, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setOnBtnClickListener()
    }

    private fun setOnBtnClickListener() {
        btn_go_to_main.setOnClickListener {
            startActivity<MainActivity>()
                (activity as ExplainAppActivity).finish()
                activity?.setResult(-101)
                activity?.finish()
        }
    }

}