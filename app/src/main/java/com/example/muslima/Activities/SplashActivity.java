package com.example.muslima.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.muslima.R;

public class SplashActivity extends AppCompatActivity {
    ImageView image_splash;
    ProgressBar progress_bar;
    TextView tv_azwaj;
    int delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        image_splash = findViewById(R.id.image_splash);
        progress_bar = findViewById(R.id.progress_bar);
        tv_azwaj = findViewById(R.id.tv_azwaj);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), NavigationActivity.class);
                startActivity(intent);
                finish();

            }
        }, delay);

    }
}
