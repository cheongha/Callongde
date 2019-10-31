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
import kotlinx.android.synthetic.main.fragment_info3_end.*

/**
 * A simple [Fragment] subclass.
 */
class Info3EndFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info3_end, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val img_url3: String? =arguments!!.getString("background_url3")

        Glide.with(this)
            .load(img_url3)
            .into(info3_content3)
    }


}