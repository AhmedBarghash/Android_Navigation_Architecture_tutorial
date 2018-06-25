package com.badr_academy.android_navigation_architecture


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // there is a couple of ways to od this the simple one is

//        R.id.accountFragment
//        Is the id of the  action in the Navigation app
//        This is way to navigate to your destination using Navigation.
        btn_accounts.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.acountFragment))

//      The second way to navigate to your destination using Navigation.
//      by using the findNavController from the view and get the id of the destination
        btn_settings.setOnClickListener {
            it.findNavController().navigate(R.id.settingsFragment)
        }
    }

}
