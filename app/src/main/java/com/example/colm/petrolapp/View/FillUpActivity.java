package com.example.colm.petrolapp.View;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.colm.petrolapp.R;

public class FillUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_up2);
    }

    public void onClick(View view) {
        Intent i = new Intent(this,MainActivity.class);

        startActivity(i);
    }





}
