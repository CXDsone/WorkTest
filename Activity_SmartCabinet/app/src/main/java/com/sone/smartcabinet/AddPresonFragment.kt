package com.sone.activity_smartcabinet

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sone.smartcabinet.R
import kotlinx.android.synthetic.main.fragment_add_preson.*

class AddPresonFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_add_preson, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        iBt_addpetson.setOnClickListener {
            val linePersonFragment = LinePersonFragment()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.Layout_person,linePersonFragment)
            fragmentTransaction.commit()
        }
    }

}// Required empty public constructor
