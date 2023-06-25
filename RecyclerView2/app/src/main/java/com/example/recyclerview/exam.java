package com.example.recyclerview;






import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class exam extends AppCompatActivity {

    ImageGalleryAdapter2 adapter;
    RecyclerView recyclerView;
    ClickListiner listiner = new ClickListiner() {
        @Override
        public void click(int index){
            Toast.makeText().show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Toolbar toolbar
                = (Toolbar)findViewById(R.id.recyclerView);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        List<ExamData> list;
        list = getData();

        recyclerView
                = (RecyclerView)findViewById(
                R.id.recyclerView);
        adapter
                = new ImageGalleryAdapter2(
                list, getApplication(),listiner);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(exam.this));
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    // Sample data for RecyclerView
    private List<ExamData> getData()
    {
        List<ExamData> list = new ArrayList<>();
        list.add(new ExamData("First Exam",
                "May 23, 2015",
                "Best Of Luck"));
        list.add(new ExamData("Second Exam",
                "June 09, 2015",
                "b of l"));
        list.add(new ExamData("My Test Exam",
                "April 27, 2017",
                "This is testing exam .."));

        return list;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}

