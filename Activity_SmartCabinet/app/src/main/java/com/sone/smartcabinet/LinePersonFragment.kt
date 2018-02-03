package com.sone.activity_smartcabinet


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sone.smartcabinet.R
import kotlinx.android.synthetic.main.fragment_line_person.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [LinePersonFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [LinePersonFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LinePersonFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_line_person, container, false)
    }

    fun changeUserName(text: String){
        tV_userName.text = text
    }
}// Required empty public constructor
