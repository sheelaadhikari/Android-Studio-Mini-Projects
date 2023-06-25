package com.example.consonantvowel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    String result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        editText=(EditText) findViewById(R.id.tv1);
        button=(Button) findViewById(R.id.bt1);
        textView=(TextView) findViewById(R.id.tv2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= editText.getText().toString();

                    textView.setText(result);

            }
        });
    }
}
