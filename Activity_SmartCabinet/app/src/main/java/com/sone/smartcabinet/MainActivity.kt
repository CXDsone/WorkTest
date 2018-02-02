package com.sone.smartcabinet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.sone.activity_smartcabinet.AddPresonFragment
import com.sone.activity_smartcabinet.SetCabinetFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment1 = AddPresonFragment()
        addFragment(R.id.frame,fragment1)

        button.setOnClickListener {
            val fragment2 = SetCabinetFragment()
            replaceFragment(R.id.frame,fragment2) }
    }

    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
        val fragmentTransaction = beginTransaction()
        fragmentTransaction.func()
        fragmentTransaction.commit()
    }
    fun AppCompatActivity.addFragment(frameId: Int, fragment: Fragment){
        supportFragmentManager.inTransaction { add(frameId, fragment) }
    }


    fun AppCompatActivity.replaceFragment(frameId: Int, fragment: Fragment) {
        supportFragmentManager.inTransaction{replace(frameId, fragment)}
    }
}
