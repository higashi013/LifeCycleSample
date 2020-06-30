package com.example.lifecyclesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LifeSycleSubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample", "Sub onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_sycle_sub);
    }
    @Override
    public void onStart(){
        Log.i("LifeCycleSample", "Sub onStart() called.");
        super.onStart();
    }
    @Override
    public void onRestart(){
        Log.i("LifeCycleSample", "Sub onRestart() called.");
        super.onRestart();
    }
    @Override
    public void onResume(){
        Log.i("LifeCycleSample", "Sub onResume() called.");
        super.onResume();
    }
    @Override
    public void onPause(){
        Log.i("LifeCycleSample", "Sub onPuase() called.");
        super.onPause();
    }
    @Override
    public void onStop(){
        Log.i("LifeCycleSample", "Sub onStop() called.");
        super.onStop();
    }
    @Override
    public void onDestroy(){
        Log.i("LifeCycleSample1", "Sub onDestroy() called.");
        super.onDestroy();
    }
    public void onButtonClick(View view){
        finish();
    }
}