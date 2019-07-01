package com.example.muslima.Activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.muslima.R;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar1;
    DrawerLayout drawer_layout2;
    RelativeLayout r_layout;
    NavigationView navview_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar1 = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);
        drawer_layout2 = findViewById(R.id.drawer_layout2);
        r_layout = findViewById(R.id.r_layout);
        navview_home = findViewById(R.id.navview_home);
        navview_home.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer_layout2, toolbar1, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_layout2.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout2);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.home, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_matches) {

            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();

        if (id == R.id.nav_home1) {
            Toast.makeText(this, "fhkf", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_msg) {
            startActivity(new Intent(this, MessagesActivity.class));

        } else if (id == R.id.nav_search) {
            startActivity(new Intent(this, SearchActivity.class));
        } else if (id == R.id.nav_profile) {

            startActivity(new Intent(this, My_Profile.class));
        } else if (id == R.id.nav_setting) {
            startActivity(new Intent(this, Setting.class));

        } else if (id == R.id.nav_help) {
            startActivity(new Intent(this, Help.class));
        } else if (id == R.id.nav_otherpages) {
            startActivity(new Intent(this, Other_Pages.class));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout2);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}



