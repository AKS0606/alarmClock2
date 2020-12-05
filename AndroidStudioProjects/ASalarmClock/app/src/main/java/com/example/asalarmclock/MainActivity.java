package com.example.asalarmclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * ↓のように引数を省略すると"Hello World!"が表示されない。
     * protected void onCreate() {
     *         setContentView(R.layout.activity_main);
     *     }
     * @param savedInstanceState
     */
      @Override
          protected void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_main);
          }

vaoishvsanvonsvds
}