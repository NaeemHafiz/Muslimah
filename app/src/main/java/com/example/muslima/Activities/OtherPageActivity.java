package com.example.muslima.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.muslima.R;
import com.example.muslima.adapters.OtherPagesAdapter;
import com.example.muslima.adapters.SettingsAdapter;
import com.example.muslima.interfaces.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class OtherPageActivity extends AppCompatActivity implements ItemClickListener {
 //   TextView tv_aboutuss,tv_contactus,tv_success_story,tv_termsofuse,tv_privacystatement;
    RecyclerView rvOtherpages;
    OtherPagesAdapter msAdapter;
    List<String> otherpagesList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other__pages);
        rvOtherpages = findViewById(R.id.otherpagesrecyclerview);
        getOtherpagesLsit();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvOtherpages.setLayoutManager(linearLayoutManager);
        rvOtherpages.addItemDecoration(new DividerItemDecoration(this, linearLayoutManager.getOrientation()));
        msAdapter = new OtherPagesAdapter(otherpagesList);
        msAdapter.setItemClickListener(this);
        rvOtherpages.setAdapter(msAdapter);
    }

    private void getOtherpagesLsit(){
        otherpagesList = new ArrayList<>();
        otherpagesList.add("About Us");
        otherpagesList.add("Contact Us");
        otherpagesList.add("Success Stories");
        otherpagesList.add("Terms of Use");
    }

    @Override
    public void onItemClick(View view, int pos) {
        switch(pos){
            case 0:onPressAboutUs(0);break;
            case 1:onPressContactUs(1);break;
            case 2:onPressSuccessStories(2);break;
            case 3:onPressTermofUse(3);break;
        }
    }
    private void onPressAboutUs(int pos){
        Toast.makeText(this,otherpagesList.get(pos),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(OtherPageActivity.this,AboutusActivity.class));

    }
 private void onPressContactUs(int pos){
        Toast.makeText(this,otherpagesList.get(pos),Toast.LENGTH_SHORT).show();
     startActivity(new Intent(OtherPageActivity.this,ContactusActivity.class));
    }
 private void onPressSuccessStories(int pos){
        Toast.makeText(this,otherpagesList.get(pos),Toast.LENGTH_SHORT).show();
     startActivity(new Intent(OtherPageActivity.this,SuccessStoryActivity.class));
    }
 private void onPressTermofUse(int pos){
        Toast.makeText(this,otherpagesList.get(pos),Toast.LENGTH_SHORT).show();
     startActivity(new Intent(OtherPageActivity.this,TermsActivity.class));
    }


  /*      tv_aboutuss=findViewById(R.id.tv_aboutuss);
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
*/

    }

