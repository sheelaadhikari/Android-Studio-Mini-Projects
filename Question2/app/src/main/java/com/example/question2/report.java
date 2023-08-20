package com.example.question2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
public class report extends Activity {
    TextView FirstName;
    TextView LastName;
    TextView Class;
    TextView Roll;

    TextView Address;
    TextView Gender;
    TextView Level;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);

        FirstName = (TextView)findViewById(R.id.firstNameValueView);
        LastName = (TextView)findViewById(R.id.lastNameValueView);
        Class = (TextView)findViewById(R.id.classValueView);
        Roll = (TextView)findViewById(R.id.rollnoInput);
        Address = (TextView)findViewById(R.id.addressValueView);


        /*Location = (TextView)findViewById(R.id.locationValueView);*/
        Gender = (TextView)findViewById(R.id.GenderValueView);
        /*Level = (TextView)findViewById(R.id.LevelValueView);*/

        Intent form = getIntent();
        String firstNameValueSubmitted = getIntent().getStringExtra("FirstName");
       String lastNameValueSubmitted = getIntent().getStringExtra("LastName");
        String classValueSubmitted = getIntent().getStringExtra("Class");
        String rollnoValueSubmitted = getIntent().getStringExtra("Rollno");
        String addressValueSubmitted = getIntent().getStringExtra("Address");

        String genderValueSubmitted = getIntent().getStringExtra("Gender");
        FirstName.setText(firstNameValueSubmitted);
        LastName.setText(lastNameValueSubmitted);
        Class.setText(classValueSubmitted);
        Roll.setText(rollnoValueSubmitted);
        Address.setText(addressValueSubmitted);

/*Location.setText(locationValueSubmitted);
Level.setText(levelValueSubmitted);*/
        Gender.setText(genderValueSubmitted);

    }
}

