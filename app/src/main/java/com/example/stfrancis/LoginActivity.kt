package com.example.stfrancis

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.util.Patterns
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
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            Toast.makeText(this, "Login to home page", Toast.LENGTH_SHORT).show()


            val username = binding.usernameInput.text.toString().trim()
            val password = binding.passwordInput.text.toString().trim()

            // Validate inputs
            when {
                username.isEmpty() -> {
                    binding.usernameInput.error = getString(R.string.error_username_empty)
                    binding.usernameInput.requestFocus()
                }

                // If input looks like an email, enforce proper email format
                username.contains("@") && !Patterns.EMAIL_ADDRESS.matcher(username).matches() -> {
                    binding.usernameInput.error = getString(R.string.error_invalid_email)
                    binding.usernameInput.requestFocus()
                }

                password.isEmpty() -> {
                    binding.passwordInput.error = getString(R.string.error_password_empty)
                    binding.passwordInput.requestFocus()
                }

                password.length < 6 -> {
                    binding.passwordInput.error = getString(R.string.error_password_length)
                    binding.passwordInput.requestFocus()
                }

                else -> {
                    // if Inputs are valid
                    Toast.makeText(this, getString(R.string.login_successful), Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }


        }

    }
}