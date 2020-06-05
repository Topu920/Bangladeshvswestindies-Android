package com.example.bangladeshvswestindies;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BanTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban_team);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("বাংলাদেশ দল");
    }
}
