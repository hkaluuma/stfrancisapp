package com.example.stfrancis

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainFragmentView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment_view)

        //calling the fragment replacement method
        replaceFragment(FragmentOne())

//        binding.fragment1Btn.setOnClickListener {
//            replaceFragment(FragmentOne())
//        }
//
//        binding.fragment2Btn.setOnClickListener {
//            replaceFragment(FragmentTwo())
//        }

    }

    //new method to replace fragment
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()
    }

}