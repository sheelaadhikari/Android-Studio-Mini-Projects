package com.example.wiringwidgets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment1 extends Fragment {
    EditText editFirst, editSecond;
    Button btnCalculate;
    TextView textResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        View view= inflater.inflate(R.layout.fragment1,container, fal se);


        editFirst= view.findViewById(R.id.edtFirst);
        editSecond= view.findViewById(R.id.edtSecond);
        btnCalculate=view.findViewById(R.id.btnCalculate);
        textResult= view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first=Integer.parseInt(editFirst.getText().toString());
                second=Integer.parseInt(editSecond.getText().toString());
                result=first+second;
                textResult.setText(("result is"+result));
            }


            });
                return view;
        }

    }

