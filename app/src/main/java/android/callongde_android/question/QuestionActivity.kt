package android.callongde_android.question

import android.callongde_android.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        setOnClickListner()
    }

    private fun setOnClickListner() {
        btn_question_close.setOnClickListener {
            finish()
        }

        rl_question_1.setOnClickListener {
            if (btn_question_under1.isSelected == false) {
                btn_question_under1.isSelected = !btn_question_under1.isSelected
                rl_question_answer1.visibility = View.VISIBLE
            } else {
                btn_question_under1.isSelected = !btn_question_under1.isSelected
                rl_question_answer1.visibility = View.GONE
            }
        }

    }
}
