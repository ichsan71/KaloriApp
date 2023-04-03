package com.marqumil.kaloriapp.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marqumil.kaloriapp.databinding.ActivityRegisterBinding
import com.marqumil.kaloriapp.ui.landingPage.LandingPageActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.toolbarBack.setOnClickListener {
            onBackPressed()
            Intent(this, LandingPageActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}