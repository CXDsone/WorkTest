package com.sone.activity_smartcabinet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sone.smartcabinet.R


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [AddPresonFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [AddPresonFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddPresonFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_add_preson, container, false)
    }
}// Required empty public constructor