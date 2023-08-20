package com.example.question2;

import                                                                android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.annotation.Nullable;

import com.google.android.material.internal.CheckableGroup;

public class Tenth extends Activity {
    Button submitBtn;
    EditText FirstName;
    EditText LastName;
    EditText Class;
    EditText RollNo;
    EditText Address;

    //    EditText Location;
    RadioGroup GenderGroup;
    RadioButton Gender;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tenth);
        Spinner spinner = (Spinner) findViewById(R.id.select);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.select, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        submitBtn = (Button)findViewById(R.id.submitBtn);
        FirstName = (EditText)findViewById(R.id.firstnameInput);
        LastName = (EditText)findViewById(R.id.lastnameInput);
        Class = (EditText)findViewById(R.id.classInput);
        RollNo = (EditText)findViewById(R.id.rollnoInput);
        Address = (EditText)findViewById(R.id.addressInput);

//        Location = (EditText)findViewById(R.id.locationInput);
        GenderGroup = (RadioGroup) findViewById(R.id.GendersGroup);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = FirstName.getText().toString();
                String last = LastName.getText().toString();

                String classn = Class.getText().toString();

                String rollno = RollNo.getText().toString();

                String address = Address.getText().toString();

//                String location = Location.getText().toString();
                int SelectedGenderId = GenderGroup.getCheckedRadioButtonId();
                Gender = (RadioButton) findViewById(SelectedGenderId);
                String gender = Gender.getText().toString();

                Intent report = new Intent(getApplicationContext(), report.class);
                report.putExtra("FirstName", first);
                report.putExtra("LastName", last);
                report.putExtra("Class", classn);
                report.putExtra("Rollno", rollno);
                report.putExtra("Address", address);

                report.putExtra("Gender", gender);
//                report.putExtra("Location",location);
                startActivity(report);
            }
        });
    }
}

