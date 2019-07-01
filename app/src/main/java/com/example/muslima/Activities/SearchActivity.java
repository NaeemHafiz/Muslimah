package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.muslima.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    TextView tv_ima, tv_male, tv_seeking, tv_female, tv_aged, tv_frstage, tv_secondage, tv_livingin, tv_country, tv_any, tv_wthin, tv_1, tv_kms, tv_any2, tv_photo, tv_photo1, tv_lastactive, tv_any3, tv_any4, tv_searchingfor, tv_marriage, tv_friendship, tv_sortresult, tv_lastactive1;

    Spinner spinner_im, spinner_seeking, spinner_age1, spinner_age2, spinner_country1, spinner_any1, spinner_distance, spinner_kms, spinner_lastactive, spinner_sortresult;
    CheckBox chkbox_photo, chkbox_any, chkbox_marriage, chkbox_friendship;
    Button btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        tv_ima = findViewById(R.id.tv_ima);

        tv_seeking = findViewById(R.id.tv_seeking);

        tv_aged = findViewById(R.id.tv_aged);

        tv_livingin = findViewById(R.id.tv_livingin);

        tv_wthin = findViewById(R.id.tv_wthin);

        tv_kms = findViewById(R.id.tv_kms);

        tv_any4 = findViewById(R.id.tv_any4);
        tv_searchingfor = findViewById(R.id.tv_searchingfor);
        tv_marriage = findViewById(R.id.tv_marriage);
        tv_sortresult = findViewById(R.id.tv_sortresultfor);
        tv_lastactive = findViewById(R.id.tv_lastactive);
        tv_photo = findViewById(R.id.tv_photo);
        tv_photo1 = findViewById(R.id.tv_photo1);
        spinner_im = findViewById(R.id.spinner_im);
        List<String> list = new ArrayList<String>();
        list.add("Male");
        list.add("Female");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_im.setAdapter(adapter);


        spinner_seeking = findViewById(R.id.spinner_seeking);
        List<String> list_seek = new ArrayList<String>();
        list_seek.add("Male");
        list_seek.add("Female");
        ArrayAdapter<String> adapter_seek = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_seek);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_seeking.setAdapter(adapter_seek);

        spinner_age1 = findViewById(R.id.spinner_age1);
        List<String> list_age = new ArrayList<String>();

        list_age.add("18");
        list_age.add("19");
        list_age.add("20");
        list_age.add("21");
        list_age.add("22");
        list_age.add("23");
        list_age.add("24");
        list_age.add("25");
        list_age.add("26");
        list_age.add("27");
        list_age.add("28");
        list_age.add("29");
        list_age.add("30");
        list_age.add("31");
        list_age.add("32");
        list_age.add("33");
        list_age.add("34");
        list_age.add("35");
        list_age.add("36");
        list_age.add("37");
        list_age.add("38");
        list_age.add("39");
        list_age.add("40");
        list_age.add("41");
        list_age.add("42");
        list_age.add("43");
        list_age.add("44");
        list_age.add("45");
        list_age.add("46");
        list_age.add("47");
        list_age.add("48");
        list_age.add("49");
        list_age.add("50");
        list_age.add("51");
        list_age.add("52");
        list_age.add("53");
        list_age.add("54");
        list_age.add("55");
        list_age.add("56");
        list_age.add("57");
        list_age.add("58");
        list_age.add("59");
        list_age.add("60");
        list_age.add("61");
        list_age.add("62");
        list_age.add("63");
        list_age.add("64");
        list_age.add("65");
        list_age.add("66");
        list_age.add("67");
        list_age.add("68");
        list_age.add("69");
        list_age.add("70");
        list_age.add("71");
        list_age.add("72");
        list_age.add("73");
        list_age.add("74");
        list_age.add("75");
        list_age.add("76");
        list_age.add("77");
        list_age.add("78");
        list_age.add("79");
        list_age.add("80");


        ArrayAdapter<String> adapter_age = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_age);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_age1.setAdapter(adapter_age);

        spinner_age2 = findViewById(R.id.spinner_age2);
        List<String> list_age2 = new ArrayList<String>();

        list_age2.add("18");
        list_age2.add("19");
        list_age2.add("20");
        list_age2.add("21");
        list_age2.add("22");
        list_age2.add("23");
        list_age2.add("24");
        list_age2.add("25");
        list_age2.add("26");
        list_age2.add("27");
        list_age2.add("28");
        list_age2.add("29");
        list_age2.add("30");
        list_age2.add("31");
        list_age2.add("32");
        list_age2.add("33");
        list_age2.add("34");
        list_age2.add("35");
        list_age2.add("36");
        list_age2.add("37");
        list_age2.add("38");
        list_age2.add("39");
        list_age2.add("40");
        list_age2.add("41");
        list_age2.add("42");
        list_age2.add("43");
        list_age2.add("44");
        list_age2.add("45");
        list_age2.add("46");
        list_age2.add("47");
        list_age2.add("48");
        list_age2.add("49");
        list_age2.add("50");
        list_age2.add("51");
        list_age2.add("52");
        list_age2.add("53");
        list_age2.add("54");
        list_age2.add("55");
        list_age2.add("56");
        list_age2.add("57");
        list_age2.add("58");
        list_age2.add("59");
        list_age2.add("60");
        list_age2.add("61");
        list_age2.add("62");
        list_age2.add("63");
        list_age2.add("64");
        list_age2.add("65");
        list_age2.add("66");
        list_age2.add("67");
        list_age2.add("68");
        list_age2.add("69");
        list_age2.add("70");
        list_age2.add("71");
        list_age2.add("72");
        list_age2.add("73");
        list_age2.add("74");
        list_age2.add("75");
        list_age2.add("76");
        list_age2.add("77");
        list_age2.add("78");
        list_age2.add("79");
        list_age2.add("80");


        ArrayAdapter<String> adapter_age2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_age2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_age2.setAdapter(adapter_age2);

        spinner_country1 = findViewById(R.id.spinner_country1);
        List<String> list_country = new ArrayList<String>();
        list_country.add("Pakistan");
        list_country.add("India");
        list_country.add("Australia");
        list_country.add("England");
        list_country.add("New zeland");
        list_country.add("Bangladesh");
        ArrayAdapter<String> adapter_country = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_country);
        adapter_country.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_country1.setAdapter(adapter_country);

        spinner_any1 = findViewById(R.id.spinner_any1);
        List<String> list_any = new ArrayList<String>();
        list_any.add("Any");
        ArrayAdapter<String> adapter_any1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_any);
        adapter_any1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_any1.setAdapter(adapter_any1);

        spinner_distance = findViewById(R.id.spinner_distance);
        List<String> list_distance = new ArrayList<String>();
        list_distance.add("- kms");
        list_distance.add("50 kms");
        list_distance.add("100 kms");
        list_distance.add("250 kms");
        list_distance.add("500 kms");
        ArrayAdapter<String> adapter_distance = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_distance);
        adapter_distance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_distance.setAdapter(adapter_distance);

        spinner_kms = findViewById(R.id.spinner_kms);
        List<String> list_kms = new ArrayList<String>();
        list_kms.add("Any");
        ArrayAdapter<String> adapter_kms = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_kms);
        adapter_kms.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_kms.setAdapter(adapter_kms);


        spinner_lastactive = findViewById(R.id.spinner_lastactive);
        List<String> list_active = new ArrayList<String>();
        list_active.add("Any");
        list_active.add("within week");
        list_active.add("within 1 month");
        list_active.add("within 3 month");
        list_active.add("within 6 month");
        list_active.add("within year");
        ArrayAdapter<String> adapter_active = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_active);
        adapter_active.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_lastactive.setAdapter(adapter_active);

        spinner_sortresult = findViewById(R.id.spinner_sortresult);
        List<String> list_result = new ArrayList<String>();
        list_result.add("Newest members");
        list_result.add("Photos First");
        list_result.add("Last Active");
        ArrayAdapter<String> adapter_result = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_result);
        adapter_active.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_sortresult.setAdapter(adapter_result);

    }
}
