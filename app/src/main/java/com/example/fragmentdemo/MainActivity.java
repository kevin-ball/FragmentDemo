package com.example.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Fragment Demo App - displays 3 Fragments
 *   Top - TextView & ImageView
 *   Middle - ImageView & TextView
 *   Bottom - ListView and TextView to display list item picked
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
