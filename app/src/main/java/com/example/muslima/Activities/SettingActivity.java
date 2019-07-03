package com.example.muslima.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.muslima.R;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void changeemail(View view) {
        startActivity(new Intent(this, ChangeEmailActivity.class));
    }

    public void changepassword(View view) {
        startActivity(new Intent(this, ChangePasswordActivity.class));
    }

    public void profilesetting(View view) {
        startActivity(new Intent(this, ProfileSettingActivity.class));
    }
}
