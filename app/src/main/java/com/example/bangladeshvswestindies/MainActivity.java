package com.example.bangladeshvswestindies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CardView game,team,score,tv,chart,stadium;
    private long backpress;
    private Toast backtoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game=findViewById(R.id.game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( MainActivity.this,PlayTime.class);
                startActivity(trt);
            }
        });
        team=findViewById(R.id.team);
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( MainActivity.this,Team.class);
                startActivity(trt);
            }
        });
        score=findViewById(R.id.score);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( MainActivity.this,Score.class);
                startActivity(trt);
            }
        });
        tv=findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( MainActivity.this,LiveTV.class);
                startActivity(trt);
            }
        });
        chart=(CardView) findViewById(R.id.chart);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( MainActivity.this,Chart.class);
                startActivity(trt);
            }
        });
        stadium=findViewById(R.id.stadium);
        stadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent( MainActivity.this,Stadium.class);
                startActivity(trt);
            }
        });
    }

    @Override
    public void onBackPressed() {
       if(backpress+2000>System.currentTimeMillis()){
           backtoast.cancel();
           super.onBackPressed();
           return;
       }else{
           backtoast=Toast.makeText(getBaseContext(),"Press back button again to exit",Toast.LENGTH_SHORT);
           backtoast.show();
       }

        backpress=System.currentTimeMillis();
    }
}
