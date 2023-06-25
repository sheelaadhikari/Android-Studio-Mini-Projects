package com.example.customgridview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
public class MainActivity extends Activity {
    GridView grid;
    String[] web = {
            "Google",
            "Github",
            "Instagram",
            "Facebook",
            "Flickr",
            "Pinterest",
            "Quora",
            "Twitter",
            "Vimeo",
            "WordPress",
            "Youtube",
            "Stumbleupon",
            "SoundCloud",
            "Reddit",
            "Blogger"
    } ;
    int[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
            R.drawable.image1,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_main);
        CustomGrid adapter = new CustomGrid(MainActivity.this,
                web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new
                                            AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent,
                                                                        View view,
                                                                        int position, long id) {
                                                    Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                                                }
                                            });
    } }