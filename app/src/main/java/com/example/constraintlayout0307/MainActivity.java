package com.example.constraintlayout0307;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=10;
    public void cl(View view){
        Toast.makeText(this, "12349", Toast.LENGTH_SHORT).show();
        TextView hh=findViewById(R.id.txt1);
        hh.setTextSize(++size);
    }
}
