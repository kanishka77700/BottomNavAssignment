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

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements Fragment1.person1 {
    String senddata;
    String senddata2=" ";
BottomNavigationView bottomNavigationView;
static Fragment1.person1 CS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomnav);
        FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(savedInstanceState!=null)
        {
            senddata2=savedInstanceState.getString("k1");
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=menuItem.getItemId();

               if(id==R.id.person1)
               {
                   Fragment1 fragment1 = new Fragment1();
                   fragmentTransaction.replace(R.id.fragmentplace,fragment1).commit();

               }
               else
               {
                   Fragment2 fragment2=new Fragment2();
                   fragment2.displayreceiveddata(senddata2);
                   fragmentTransaction.replace(R.id.fragmentplace,fragment2).commit();

               }

                return true;
            }
        });
    }


    @Override
    public void sendinputs1(String p1) {
        senddata=p1;


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("k1",senddata);
    }
}
