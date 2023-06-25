package com.example.wiringwidgets;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class FirstActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
    }
}
