package com.example.stfrancis

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
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


            val username = binding.usernameInput.text.toString().trim()
            val password = binding.passwordInput.text.toString().trim()

            // Validate inputs
            when {
                username.isEmpty() -> {
                    binding.usernameInput.error = "Username cannot be empty"
                    binding.usernameInput.requestFocus()
                }

                password.isEmpty() -> {
                    binding.passwordInput.error = "Password cannot be empty"
                    binding.passwordInput.requestFocus()
                }

                password.length < 6 -> {
                    binding.passwordInput.error = "Password must be at least 6 characters long"
                    binding.passwordInput.requestFocus()
                }

                else -> {
                    // if Inputs are valid
                    Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                   // intent.putExtra("FRAGMENT_NAME", "FirstFragment") // Specify the fragment to load
                    startActivity(intent)
                }
            }


        }

    }
}