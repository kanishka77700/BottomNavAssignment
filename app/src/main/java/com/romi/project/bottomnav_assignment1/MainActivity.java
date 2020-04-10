package com.romi.project.bottomnav_assignment1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements Fragment1.person1 {
    String senddata;
    String senddata2;
BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomnav);
        if (savedInstanceState != null) {

            senddata2 = savedInstanceState.getString("key");
        }
        if(senddata2!=null)
        {
            new Fragment2().updatedata(senddata2);
        }



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    int id = menuItem.getItemId();
                    Fragment1 fragment1 = new Fragment1();
                    Fragment2 fragment2 = new Fragment2();

                    if (id == R.id.person1) {

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplace, fragment1).commit();
                        return true;

                    } else if (id == R.id.person2) {


                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplace, fragment2).commit();

                        return true;


                    }
                    return false;

                }
            });
        }


    @Override
    public void sendinputs1(String p11) {
        senddata=p11;


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key",senddata);
    }
}
