package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity2(View view) {
            Intent intent = new Intent(this, activity2.class);
            startActivity(intent);
    }
    /*public void goToActivity3(View view) {
            Intent intent = new Intent(this, activity3.class);
            startActivity(intent);
    }*/

}