package com.alibekus.kmf_test.user_info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alibekus.kmf_test.R

class UserInfoActivity : AppCompatActivity() {

    private lateinit var searchButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)
        bindViews()
    }

    private fun bindViews() {
        searchButton = findViewById(R.id.activity_user_info_button_search)
    }
}