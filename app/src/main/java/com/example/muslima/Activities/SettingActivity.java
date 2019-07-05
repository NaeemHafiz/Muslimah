package com.example.muslima.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.muslima.R;
import com.example.muslima.adapters.SettingsAdapter;
import com.example.muslima.interfaces.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class SettingActivity extends AppCompatActivity implements ItemClickListener {
    RecyclerView rvSetting;
    SettingsAdapter mAdapter;
    List<String> settingsList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        rvSetting = findViewById(R.id.simplerecycleView);
        getSettingsList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvSetting.setLayoutManager(linearLayoutManager);
        rvSetting.addItemDecoration(new DividerItemDecoration(this, linearLayoutManager.getOrientation()));
        mAdapter = new SettingsAdapter(settingsList);
        mAdapter.setItemClickListener(this);
        rvSetting.setAdapter(mAdapter);
    }

    private void getSettingsList(){
        settingsList = new ArrayList<>();
        settingsList.add("Email");
        settingsList.add("Password");
        settingsList.add("Profile Setting");
        settingsList.add("Select Packages");
    }

    @Override
    public void onItemClick(View view, int pos) {
        switch(pos){
            case 0:onPressEmail(0);break;
            case 1:onPressPassword(1);break;
            case 2:onPressProfileSetting(2);break;
            case 3:onPressSelectPackage(3);break;
        }
    }
    private void onPressEmail (int pos){
        Toast.makeText(this,settingsList.get(pos),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(SettingActivity.this,ChangeEmailActivity.class));

    } private void onPressPassword (int pos){
        Toast.makeText(this,settingsList.get(pos),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(SettingActivity.this,ChangePasswordActivity.class));

    } private void onPressProfileSetting (int pos){
        Toast.makeText(this,settingsList.get(pos),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(SettingActivity.this,ProfileSettingActivity.class));

    } private void onPressSelectPackage(int pos){
        Toast.makeText(this,settingsList.get(pos),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(SettingActivity.this,NotificationActivity.class));


    }
   /* public void changeemail(View view) {
        startActivity(new Intent(this, ChangeEmailActivity.class));
    }

    public void changepassword(View view) {
        startActivity(new Intent(this, ChangePasswordActivity.class));
    }

    public void profilesetting(View view) {
        startActivity(new Intent(this, ProfileSettingActivity.class));
    }

    public void MoveToNotications(View view) {
        startActivity(new Intent(this, NotificationActivity.class));
    }

    public void moveToSelectPackages(View view) {
        startActivity(new Intent(this, SelectPackagesActivity.class));


    }*/
}
