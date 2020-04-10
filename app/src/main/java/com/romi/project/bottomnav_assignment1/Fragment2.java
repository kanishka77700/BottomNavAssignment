package com.romi.project.bottomnav_assignment1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    EditText name2;
    Button add2;
    TextView finalname2;
    String data = " ";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment2, container, false);
        //super.onCreateView(R.layout.activity_fragment1,container,false);
        name2 = (EditText) view.findViewById(R.id.name2);
        add2 = (Button) view.findViewById(R.id.add2);
        finalname2 = (TextView) view.findViewById(R.id.name2text);
        if(data!=" ")
        {
            finalname2.setText(data);
        }


        return view;

    }


    public void updatedata(String senddata22) {

       data=senddata22;
    }
}
