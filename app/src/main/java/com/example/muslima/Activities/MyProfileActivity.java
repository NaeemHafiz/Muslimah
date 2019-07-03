package com.example.muslima.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.muslima.R;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__profile);
    }

    public void newprofle(View view) {
        startActivity(new Intent(this, MyNewProfileActivity.class));
    }


    public void moveToInterestActivity(View view) {
        startActivity(new Intent(MyProfileActivity.this, InterestActivity.class));
    }

    public void movetoverifyprofile(View view) {
        startActivity(new Intent(MyProfileActivity.this, ViewProfileActivity.class));

    }
}
