package com.alibekus.kmf_test.registration_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.core.text.isDigitsOnly
import com.alibekus.kmf_test.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class RegistrationActivity : AppCompatActivity() {
    private lateinit var login: EditText
    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var phoneNumber: EditText

    private lateinit var submitButton: Button
    private lateinit var statusButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        bindViews()
    }

    private fun bindViews() {
        login = findViewById(R.id.activity_registration_edit_text_login)
        firstName = findViewById(R.id.activity_registration_edit_text_first_name)
        lastName = findViewById(R.id.activity_registration_edit_text_last_name)
        email = findViewById(R.id.activity_registration_edit_text_email)
        password = findViewById(R.id.activity_registration_edit_text_password)
        phoneNumber = findViewById(R.id.activity_registration_edit_text_phone_number)
        submitButton = findViewById(R.id.activity_registration_button_submit)
        statusButton = findViewById(R.id.activity_registration_button_status)

        phoneNumber.addTextChangedListener(phoneNumberTextWatcher)
        email.addTextChangedListener(emailTextWatcher)

        statusButton.setOnClickListener {
            val modalbottomSheetFragment = BottomSheetDialogFragment()
            modalbottomSheetFragment.show(supportFragmentManager,modalbottomSheetFragment.tag)

        }

    }

    private val phoneNumberTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

        override fun afterTextChanged(p0: Editable?) {
            submitButton.isEnabled =
                !p0.toString().isBlank() && p0!!.isDigitsOnly() || p0!!.contains('+')
        }
    }

    private val emailTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit

        override fun afterTextChanged(p0: Editable?) {
            submitButton.isEnabled =
                !p0.toString().isBlank() && p0!!.contains('@')
        }
    }



}