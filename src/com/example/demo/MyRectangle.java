package com.example.demo;

import android.util.Log;

public class MyRectangle implements IShape {
    public MyRectangle(){
    }

    @Override
    public void drawImage() {
        Log.e("MyRectangle", "draw MyRectangle");
    }

   }
