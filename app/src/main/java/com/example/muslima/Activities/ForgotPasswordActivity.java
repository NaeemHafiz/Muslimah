package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.muslima.R;

public class ForgotPasswordActivity extends AppCompatActivity {
    TextView tv_emailforgot, tv_code, tv_desc_code;
    EditText et_enteremailforgot, et_entercode;
    Button btn_reset_password;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotten_password);
        tv_emailforgot = findViewById(R.id.tv_emailforgot);
        tv_code = findViewById(R.id.tv_code);
        tv_desc_code = findViewById(R.id.tv_desc_code);
        et_entercode = findViewById(R.id.et_entercode);
        et_enteremailforgot = findViewById(R.id.et_enteremailforgot);
        btn_reset_password = findViewById(R.id.btn_reset_password);
        btn_reset_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_enteremailforgot.getText().toString();
                if (email.equals("")) {
                    et_enteremailforgot.setError("please enter your email address");


                }
                String entercode = et_entercode.getText().toString();
                if (entercode.equals("")) {
                    et_entercode.setError("Please enter the 4 digit code you see in the image above");
                }

            }
        });
    }


}