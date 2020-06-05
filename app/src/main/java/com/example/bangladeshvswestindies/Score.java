package com.example.bangladeshvswestindies;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("লাইভ স্কোর");
    }
}
