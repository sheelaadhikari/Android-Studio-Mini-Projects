package com.example.costumdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mDialogButton;
    TextView okay_text, cancel_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialogButton = findViewById(R.id.dialogBtn);
        Dialog dialog = new Dialog(MainActivity.this);

        mDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.setContentView(R.layout.relative_layout);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.Theme_CostumDialog;

                okay_text = dialog.findViewById(R.id.okay_text);
                cancel_text = dialog.findViewById(R.id.cancel_text);

                okay_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "okay clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
    }
}
