package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FullViewActivity extends AppCompatActivity {
    public static String Title, Desc;
    public static TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);
        initializeData();
        getData();
        setData();
    }

    private void setData() {
        txtDescription.setText(Desc);
    }

    private void getData() {
        Bundle extras = getIntent().getExtras();
        Title = extras.getString("Title","");
        Desc = extras.getString("Desc","");
    }

    private void initializeData() {
        txtDescription = findViewById(R.id.txtDescription);
    }
}
