package com.example.stfrancis

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.stfrancis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvStaffProfile
            .setOnClickListener {
                Toast.makeText(this, "Selected Staff Profile", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainFragmentView::class.java)
                startActivity(intent)
            }
        binding.tvStudentsProfile
            .setOnClickListener {
                Toast.makeText(this, "Selected Students Profile", Toast.LENGTH_SHORT).show()
                val intentStud = Intent(this, MainFragmentView::class.java)
                startActivity(intentStud)
            }
        binding.tvTopStudents
            .setOnClickListener {
                Toast.makeText(this, "Selected Top Students", Toast.LENGTH_SHORT).show()
                val intentStTop = Intent(this, MainFragmentView::class.java)
                startActivity(intentStTop)
            }
        binding.tvSchoolCalender
            .setOnClickListener {
                Toast.makeText(this, "You have selected Calender", Toast.LENGTH_SHORT).show()
                val intentCal = Intent(this, MainFragmentView::class.java)
                startActivity(intentCal)
            }
        binding.tvClassPerformance
            .setOnClickListener {
                Toast.makeText(this, "You have selected Class Performances", Toast.LENGTH_SHORT).show()
                val intentPaf = Intent(this, MainFragmentView::class.java)
                startActivity(intentPaf)
            }
        binding.tvMealsSchedule
            .setOnClickListener {
                Toast.makeText(this, "You have selected Class Performances", Toast.LENGTH_SHORT).show()
                val intentPaf = Intent(this, MainFragmentView::class.java)
                startActivity(intentPaf)
            }

    }
}