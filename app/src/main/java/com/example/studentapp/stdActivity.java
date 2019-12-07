package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class stdActivity extends AppCompatActivity {
    TextView std_id,std_name,std_level,std_avg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std);
        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        String avg=getIntent().getStringExtra("avg");
        std_avg = findViewById(R.id.std_avg);
        std_avg.setText(avg);
        std_id =findViewById(R.id.std_id);
        std_id.setText(id);
        std_name =findViewById(R.id.std_name);
        std_name.setText(name);
        std_level = findViewById(R.id.std_level);
        std_level.setText(level);


    }
}
