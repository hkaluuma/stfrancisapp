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
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //new codes here
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.loginButton.setOnClickListener {
            Toast.makeText(this, "Login to home page", Toast.LENGTH_SHORT).show()

            // In SourceActivity
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("FRAGMENT_NAME", "FirstFragment") // Specify the fragment to load
            startActivity(intent)
        }

    }
}