package com.dar3434.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Template extends AppCompatActivity {

    SharedPreferences preferences;
    TextView fname,sname,tvaddress,tvemail,tvphone,tvhobby,tvschool,tvcourse,tvgrade,tvyear,tvCompany,tvjob,tvDesciription,tvJobyear,tvskill1,tvskill2,tvskill3,tvskill4,tvgithub,tvlinkedin,tvobjective,tvcompanyname,tvcompanylink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        preferences = getSharedPreferences("Data",0);

        fname = findViewById(R.id.fname);
        sname = findViewById(R.id.sname);
        tvaddress = findViewById(R.id.tvaddress);
        tvemail = findViewById(R.id.tvemail);
        tvphone = findViewById(R.id.tvphone);
        tvhobby = findViewById(R.id.tvhobby);
        tvschool = findViewById(R.id.tvschool);
        tvcourse = findViewById(R.id.tvcourse);
        tvgrade = findViewById(R.id.tvgrade);
        tvyear = findViewById(R.id.tvyear);
        tvCompany = findViewById(R.id.tvCompany);
        tvjob = findViewById(R.id.tvjob);
        tvDesciription = findViewById(R.id.tvDesciription);
        tvJobyear = findViewById(R.id.tvJobyear);
        tvskill1 = findViewById(R.id.tvskill1);
        tvskill2 = findViewById(R.id.tvskill2);
        tvskill3 = findViewById(R.id.tvskill3);
        tvskill4 = findViewById(R.id.tvskill4);
        tvlinkedin = findViewById(R.id.tvlinkedin);
        tvgithub = findViewById(R.id.tvgithub);
        tvobjective = findViewById(R.id.tvobjective);
        tvcompanyname = findViewById(R.id.tvcompanyname);
        tvcompanylink = findViewById(R.id.tvcompanylink);

        String d1 = preferences.getString("fname","");
        String d2 = preferences.getString("lname","");
        String d3 = preferences.getString("address","");

        fname.setText(d1);
        sname.setText(d2);
        sname.setText(d3);
    }
}


