package com.example.muslima.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.muslima.R;

public class Pop extends Activity {
    Button btn_save;

    EditText et_username, et_useremail, et_userpassword, et_userphone, et_usercnic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .6));


        btn_save = findViewById(R.id.btn_save);

        et_username = findViewById(R.id.et_usercnic);
        et_useremail = findViewById(R.id.et_useremail);
        et_username = findViewById(R.id.et_username);
        et_userpassword = findViewById(R.id.et_userpassword);
        et_userphone = findViewById(R.id.et_userphone);
        et_usercnic = findViewById(R.id.et_usercnic);
    }

    public void popup(View view) {
        startActivity(new Intent(Pop.this, My_Profile.class));
    }
}
