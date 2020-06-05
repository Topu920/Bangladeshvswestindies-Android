package com.example.bangladeshvswestindies;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Team extends AppCompatActivity {
    private CardView BANTEAM,WITEAM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("দলের সদস্য পরিচিতি");
        BANTEAM=findViewById(R.id.BANTEAM);
        BANTEAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( Team.this,BanTeam.class);
                startActivity(trt);
            }
        });
        WITEAM=findViewById(R.id.WITEAM);
        WITEAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( Team.this,WITeam.class);
                startActivity(trt);
            }
        });
    }
}
