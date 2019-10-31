package android.callongde_android.survey.surveyoutcome

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.callongde_android.R
import android.callongde_android.survey.OutcomeActivity
import kotlinx.android.synthetic.main.fragment_outcome_fragment3.*

class OutcomeFragment3: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_outcome_fragment3, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setOnBtnClickListener()
    }

    private fun setOnBtnClickListener() {
        btn_outcome_finish.setOnClickListener {
            (activity as OutcomeActivity).finish()

            activity?.setResult(-101)
            activity?.finish()
        }
    }


}