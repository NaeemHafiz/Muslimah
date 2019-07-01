package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.muslima.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class TestimonialActivity extends AppCompatActivity {
    TextView tv_thanksmuslima, tv_serif;
    CircleImageView image_couple;
    Button btn_next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testimonial);
        tv_thanksmuslima = findViewById(R.id.tv_thanksmuslima);
        tv_serif = findViewById(R.id.tv_serif);
        image_couple = findViewById(R.id.image_couple);
        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
