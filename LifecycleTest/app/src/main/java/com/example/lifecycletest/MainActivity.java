package com.example.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private  final  String TAG = "LifecycleTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "onCreate!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "onRestart:");
    }

    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume:");
    }

    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause:");
    }

    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop:");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy:");
    }
}