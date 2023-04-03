package com.marqumil.kaloriapp.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.commit
import com.marqumil.kaloriapp.MainActivity
import com.marqumil.kaloriapp.R
import com.marqumil.kaloriapp.databinding.ActivityLoginBinding
import com.marqumil.kaloriapp.ui.home.HomeFragment
import com.marqumil.kaloriapp.ui.landingPage.LandingPageActivity

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.toolbarBack.setOnClickListener {
            onBackPressed()
            Intent(this, LandingPageActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnLogin.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

    }


}