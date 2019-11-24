package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RegisterActivity extends Activity {
    public static ImageView backBtn;
    public static Button loginBtn,sendOtpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initailiseData();
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
        sendOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendOtpIntent = new Intent(RegisterActivity.this, SendOTPActivity.class);
                startActivity(sendOtpIntent);
            }
        });
    }

    private void initailiseData() {
        backBtn = (ImageView) findViewById(R.id.backBtn);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        sendOtpBtn = (Button) findViewById(R.id.sendOtpBtn);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
