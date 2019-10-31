package android.callongde_android.info


import android.callongde_android.infomation.InformationActivity1
import android.callongde_android.infomation.InformationActivity2
import android.callongde_android.infomation.InformationActivity3
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_info.*
import org.jetbrains.anko.support.v4.startActivity

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(android.callongde_android.R.layout.fragment_info, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        btn_info_img1.setOnClickListener {
            startActivity<InformationActivity1>()
        }
        btn_info_img2.setOnClickListener {
            startActivity<InformationActivity2>()
        }
        btn_info_img3.setOnClickListener {
            startActivity<InformationActivity3>()
        }
    }

}
