package com.example.login.Welcome

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.login.R

class LoginActivity : Activity() {
    lateinit var userEmail: EditText
    lateinit var userPassword: EditText
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initializeData()
        userEmail.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                Log.e("afterTextChanged",s.toString())
                if(s.toString().contains(" ")){
                    s.toString().replace(" ", "xx");
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.e("beforeTextChanged",s.toString())
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.e("onTextChanged",s.toString())
            }
        })
        userPassword.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Log.e("afterTextChanged",s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.e("beforeTextChanged",s.toString())
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.e("onTextChanged",s.toString())
            }

        })
        btnLogin.setOnClickListener{
            
        }
    }

    private fun initializeData() {
        userEmail = findViewById(R.id.userEmail)
        userPassword = findViewById(R.id.userPassword)
        btnLogin = findViewById(R.id.btnLogin)
    }
}
