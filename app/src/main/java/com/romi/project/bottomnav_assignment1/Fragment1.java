package com.romi.project.bottomnav_assignment1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    EditText personname1;
    Button add11;
    TextView finalname1;
    person1 listner1;



    interface person1
{ void sendinputs1(String p1);
}

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment1, container, false);
        personname1 = (EditText) view.findViewById(R.id.name1);
        add11 = (Button) view.findViewById(R.id.add1);
        finalname1 = (TextView) view.findViewById(R.id.name1text);
        add11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listner1.sendinputs1(personname1.getText().toString().trim());
            }
        });

    return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listner1= (person1) context;
    }
}
