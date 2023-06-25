package com.example.multiplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {
EditText editText;
Button button;
TextView textView;
String  result;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.ed1);
        button=(Button) findViewById(R.id.bt1);
        textView=(TextView) findViewById(R.id.tv2);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number= editText.getText().toString();
                int n= Integer.parseInt(number);

                for (int i=1;i<=20; i++){
                    result += n+ " " + "*" +i+ "=" + " " + n*i;
                    System.out.println("/n ");
                    textView.setText(result);
                }
            }
        });
    }
}
