package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SendOTPActivity extends Activity {
    public static ImageView backBtn;
    public static Button reSendOtpBtn,cancelOTPBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_otp);
        initailiseData();
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        cancelOTPBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void initailiseData() {
        backBtn = (ImageView) findViewById(R.id.sendOtpBackBtn);
        reSendOtpBtn = (Button) findViewById(R.id.reSendOtpBtn);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
