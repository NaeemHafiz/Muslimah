package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.muslima.R;

public class MessageActivity extends AppCompatActivity {
    Button btn_recieve, btn_sent, btn_seesinglesnow;
    TextView tv_recsent, tv_msgdescp, tv_currentmsg, tv_frstmove, tv_communication_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        btn_recieve = findViewById(R.id.btn_recieve);
        btn_sent = findViewById(R.id.btn_sent);
        btn_seesinglesnow = findViewById(R.id.btn_seesinglesnow);
        tv_recsent = findViewById(R.id.tv_recsent);
        tv_currentmsg = findViewById(R.id.tv_currentmsg);
        tv_msgdescp = findViewById(R.id.tv_msgdescp);
        btn_recieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_recieve.setBackgroundColor(getResources().getColor(R.color.background));
                btn_recieve.setTextColor(getResources().getColor(R.color.textcolor));
                tv_recsent.setText("Recieved");
                btn_sent.setBackgroundColor(getResources().getColor(R.color.gray));
                tv_recsent.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        btn_sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_sent.setBackgroundColor(getResources().getColor(R.color.background));
                btn_sent.setTextColor(getResources().getColor(R.color.textcolor));
                tv_recsent.setText("Sent");
                btn_recieve.setBackgroundColor(getResources().getColor(R.color.gray));
                tv_recsent.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
    }
}
