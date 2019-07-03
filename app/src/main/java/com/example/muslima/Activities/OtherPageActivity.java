package com.example.muslima.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.muslima.R;

public class OtherPageActivity extends AppCompatActivity {
    TextView tv_aboutuss,tv_contactus,tv_success_story,tv_termsofuse,tv_privacystatement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other__pages);
        tv_aboutuss=findViewById(R.id.tv_aboutuss);
        tv_aboutuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(OtherPageActivity.this,AboutusActivity.class));
            }
        });
        tv_contactus=findViewById(R.id.tv_contactus);
        tv_contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherPageActivity.this,ContactusActivity.class));
            }
        });
        tv_success_story=findViewById(R.id.tv_success_story);
        tv_success_story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherPageActivity.this,SuccessStoryActivity.class));
            }
        });
        tv_termsofuse=findViewById(R.id.tv_termsofuse);
        tv_termsofuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherPageActivity.this,TermsActivity.class));

            }
        });
        tv_privacystatement=findViewById(R.id.tv_privacystatement);
        tv_privacystatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherPageActivity.this,PrivacyActivity.class));
            }
        });


    }

    public void moveToSuccessStoryActivity(View view) {
        startActivity(new Intent(OtherPageActivity.this, SuccessStoryActivity.class));


    }
}
