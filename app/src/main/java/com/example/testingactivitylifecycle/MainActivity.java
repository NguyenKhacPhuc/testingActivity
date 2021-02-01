package com.example.testingactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new Fragment1()).addToBackStack("").commit();
        });
        Log.d("on create","I'm on create");


    }

    @Override
    protected void onStart() {
        Log.d("on start","I'm on start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("on resume","I'm on resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("on pause","I'm on pause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("on stop","I'm on stop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("on restart","I'm on restart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("on destroy","I'm on destroy");
        super.onDestroy();
    }
}