package com.example.bangladeshvswestindies;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LiveTV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_tv);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("লাইভ টিভি");
    }
}
