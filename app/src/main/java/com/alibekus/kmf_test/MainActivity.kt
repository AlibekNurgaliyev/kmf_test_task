package com.alibekus.kmf_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alibekus.kmf_test.registration_activity.RegistrationActivity
import com.alibekus.kmf_test.user_info.UserInfoActivity

class MainActivity : AppCompatActivity() {
    private val registrationButton: Button by lazy {
        findViewById(R.id.activity_main_button_registration)
    }

    private val userInfoButton: Button by lazy {
        findViewById(R.id.activity_main_button_user_info)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registrationButton.setOnClickListener {
            navigateToRegistrationActivity()
        }

        userInfoButton.setOnClickListener {
            navigateToUserInfoActivity()
        }
    }

    private fun navigateToRegistrationActivity() {
        val registrationIntent = Intent(this, RegistrationActivity::class.java)
        startActivity(registrationIntent)
    }

    private fun navigateToUserInfoActivity() {
        val userInfoIntent = Intent(this, UserInfoActivity::class.java)
        startActivity(userInfoIntent)
    }
}