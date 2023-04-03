package com.marqumil.kaloriapp.ui.landingPage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marqumil.kaloriapp.R
import com.marqumil.kaloriapp.databinding.ActivityLandingPageBinding
import com.marqumil.kaloriapp.ui.login.LoginActivity
import com.marqumil.kaloriapp.ui.register.RegisterActivity

class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnLogin.setOnClickListener {
                Intent(this@LandingPageActivity, LoginActivity::class.java).also {
                    startActivity(it)
                }
            }

            btnRegister.setOnClickListener {
                Intent(this@LandingPageActivity, RegisterActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
    }
}