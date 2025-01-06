package com.example.stfrancis

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.stfrancis.databinding.ActivityLoginBinding
import com.example.stfrancis.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    //added variables
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //new codes here
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            Toast.makeText(this, "Login to home page", Toast.LENGTH_SHORT).show()
        }

    }
}