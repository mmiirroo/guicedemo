package com.example.demo;

import roboguice.activity.RoboActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.inject.Inject;

public class MainActivity extends RoboActivity {
    @Inject    @Rectangle    IShape shape1;
    @Inject    @Square    IShape shape2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", null == shape1 ? "" : shape1.toString());
        Log.e("MainActivity", null == shape2 ? "" : shape2.toString());
    }
}
