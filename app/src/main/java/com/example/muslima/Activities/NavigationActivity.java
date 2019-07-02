package com.example.muslima.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.muslima.R;

import java.util.ArrayList;
import java.util.List;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView customview;
    TextView tv_desc, tv_desc2, tv_im, tv_lookingfor, tv_fnmae, tv_age, tv_where, tv_email, tv_password, tv_agreement, tv_choosemuslima, tv_choose_desc,
            tv_muslima_matrimonial, tv_media, tv_muslima_success, tv_success_story, tv_help, tv_aboutus, tv_contactus, tv_success_stories, tv_dating_safety,
            tv_terms, tv_privacy, tv_cookie, tv_muslim_women, tv_muslim_men, tv_join_free;
    Button btn_fb, btn_email, btn_counselor, btn_viewsingles;
    RadioGroup rd_1, rd_2;
    RadioButton radio_man, radio_woman, radio_man1, radio_woman1;
    EditText et_fname, et_enteremail, et_enterpassword;
    CheckBox chkbox_1;
    NavigationView nav_view;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        customview = findViewById(R.id.customView);
        tv_desc = findViewById(R.id.tv_desc);
        tv_desc2 = findViewById(R.id.tv_desc2);
        tv_im = findViewById(R.id.tv_im);
        tv_lookingfor = findViewById(R.id.tv_lookingfor);
        tv_fnmae = findViewById(R.id.tv_fname);
        tv_age = findViewById(R.id.tv_age);
        tv_where = findViewById(R.id.tv_where);
        tv_email = findViewById(R.id.tv_email);
        tv_password = findViewById(R.id.tv_password);
        tv_agreement = findViewById(R.id.tv_agreement);
        tv_choosemuslima = findViewById(R.id.tv_choosemuslima);
        tv_choose_desc = findViewById(R.id.tv_choose_desc);
        tv_muslima_matrimonial = findViewById(R.id.tv_muslima_matrimonial);
        tv_media = findViewById(R.id.tv_media);
        tv_muslima_success = findViewById(R.id.tv_muslima_success);
        tv_success_story = findViewById(R.id.tv_success_story);
        tv_help = findViewById(R.id.tv_help);
        tv_aboutus = findViewById(R.id.tv_aboutus);
        tv_aboutus = findViewById(R.id.tv_aboutus);
        tv_contactus = findViewById(R.id.tv_contactus);
        tv_success_stories = findViewById(R.id.tv_success_stories);
        tv_dating_safety = findViewById(R.id.tv_dating_safety);
        tv_terms = findViewById(R.id.tv_terms);
        tv_privacy = findViewById(R.id.tv_privacy);
        tv_cookie = findViewById(R.id.tv_cookie);
        tv_muslim_women = findViewById(R.id.tv_muslim_women);
        tv_muslim_men = findViewById(R.id.tv_muslim_men);
        tv_join_free = findViewById(R.id.tv_join_free);
        btn_fb = findViewById(R.id.btn_fb);
        btn_email = findViewById(R.id.btn_email);
        btn_counselor = findViewById(R.id.btn_counselor);
        btn_viewsingles = findViewById(R.id.btn_viewsingles);
        et_enteremail = findViewById(R.id.et_enteremail);
        et_enterpassword = findViewById(R.id.et_enterpassword);
        et_fname = findViewById(R.id.et_fname);
        chkbox_1 = findViewById(R.id.chkbox_1);
        nav_view = findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(this);
        btn_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.facebook.com"));
                startActivity(intent);
            }
        });
        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.gmail.com"));
                startActivity(intent);
            }
        });
        btn_counselor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationActivity.this, PopActivity.class);
                startActivity(intent);

            }
        });
        btn_viewsingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_fname.getText().toString();
                if (name.equals("")) {
                    et_fname.setError("Please enter your first name");
                }
                String email = et_enteremail.getText().toString();
                if (email.equals("")) {
                    et_enteremail.setError("Enter your email");
                }
                String password = et_enterpassword.getText().toString();
                if (password.equals("")) {
                    et_enterpassword.setError("enter your password");
                }

            }


        });




        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id) {
            case R.id.nav_home:
                Intent intent = new Intent(getApplicationContext(), NavigationActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_login:
                Intent loginintent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(loginintent);
                break;
            case R.id.nav_Testimonial:
                Intent testintent = new Intent(NavigationActivity.this, TestimonialActivity.class);
                startActivity(testintent);
                break;
            case R.id.nav_gallery:
                Intent galleryintent = new Intent(getApplicationContext(), GalleryActivity.class);
                startActivity(galleryintent);
                break;


        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

