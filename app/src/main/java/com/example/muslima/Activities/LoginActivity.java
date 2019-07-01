package com.example.muslima.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muslima.R;

public class LoginActivity extends AppCompatActivity {
    ImageView image_muslima, image_fb;
    TextView tv_email, tv_password, tv_logged, tv_line1, tv_or, tv_line2, tv_forgottenpassword;
    EditText et_email, et_password;
    Button btn_login;
    CheckBox chkbox_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        image_muslima = findViewById(R.id.image_muslima);
        image_fb = findViewById(R.id.image_fb);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        tv_email = findViewById(R.id.tv_email);
        tv_password = findViewById(R.id.tv_password);
        tv_logged = findViewById(R.id.tv_logged);
        tv_line1 = findViewById(R.id.tv_line1);
        tv_line2 = findViewById(R.id.tv_line2);
        tv_or = findViewById(R.id.tv_or);
        tv_forgottenpassword = findViewById(R.id.tv_forgotpassword);
        btn_login = findViewById(R.id.btn_login);
        chkbox_login = findViewById(R.id.chkbox_login);
        tv_forgottenpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ForgottenPassword.class);
                startActivity(intent);
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}

