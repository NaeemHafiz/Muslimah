package com.example.muslima.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.muslima.R;

public class OtherPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other__pages);
    }

    public void moveToSuccessStoryActivity(View view) {
        startActivity(new Intent(OtherPageActivity.this, SuccessStoryActivity.class));


    }
}
