package com.example.bangladeshvswestindies;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        logo Logo= new logo();
        Logo.start();
    }
    private class logo extends Thread {
        public void run() {
            try {
                sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent trt = new Intent(Splash.this, MainActivity.class);
            startActivity(trt);
            Splash.this.finish();

        }
    }
}
