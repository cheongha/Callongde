package android.callongde_android.infomation

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.callongde_android.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_first_content.*

/**
 * A simple [Fragment] subclass.
 */
class FirstContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_content, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val img_url:String= arguments!!.getString( "background_url1")!!

        Glide.with(this)
            .load(img_url)
            .into(info2_moring_img)

    }


}