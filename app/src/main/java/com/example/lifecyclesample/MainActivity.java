package com.example.lifecyclesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample", "Main onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onStart(){
        Log.i("LifeCycleSample", "Main onStart() called.");
        super.onStart();
    }
    @Override
    public void onRestart(){
        Log.i("LifeCycleSample", "Main onRestart() called.");
        super.onRestart();
    }
    @Override
    public void onResume(){
        Log.i("LifeCycleSample", "Main onResume() called.");
        super.onResume();
    }
    @Override
    public void onPause(){
        Log.i("LifeCycleSample", "Main onPuase() called.");
        super.onPause();
    }
    @Override
    public void onStop(){
        Log.i("LifeCycleSample", "Main onStop() called.");
        super.onStop();
    }
    @Override
    public void onDestroy(){
        Log.i("LifeCycleSample", "Main onDestroy() called.");
        super.onDestroy();
    }

    public void onButtonClick(View view){
        Intent intent = new Intent(MainActivity.this, LifeSycleSubActivity.class);
        startActivity(intent);
    }


}