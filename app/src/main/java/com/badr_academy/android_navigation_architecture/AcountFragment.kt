package com.badr_academy.android_navigation_architecture


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_acount.*

class AcountFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_acount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_showArg.setOnClickListener {
            val namebundel = Bundle()
            namebundel.putString("name",edittext.text.toString())
            it.findNavController().navigate(R.id.showArgFragment,namebundel)
        }
    }
}
