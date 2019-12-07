package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<student> stdList = new ArrayList<student>();
    RecyclerView std_rv;
    stdAdapter stdAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        std_rv = findViewById(R.id.students_rv);
        std_rv.setLayoutManager(new LinearLayoutManager(this));
        stdAdapter = new stdAdapter(this ,stdList );
        std_rv.setAdapter(stdAdapter);
    }

    private void initData() {
        stdList . add(new student("1","Maysa" , "fifth" , "94.9"));
        stdList . add(new student("2","Tasneem" , "fourth" , "90.9"));
        stdList . add(new student("3","yasmeen" , "third" , "91.9"));
        stdList . add(new student("4","Bara" , "fifth" , "91"));
        stdList . add(new student("5","Khadija" , "fourth" , "99"));
        stdList . add(new student("6","Jasmeen" , "third" , "89"));
        stdList . add(new student("7","yasmeen" , "third" , "91.9"));
        stdList . add(new student("8","Bara" , "fifth" , "91"));
        stdList . add(new student("9","Khadija" , "fourth" , "99"));
        stdList . add(new student("10","Jasmeen" , "third" , "89"));
    }
}
