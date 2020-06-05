package com.example.bangladeshvswestindies;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WITeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_witeam);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("ওয়েস্ট ইন্ডিজ দল");
    }
}
