package com.example.demo;

import roboguice.config.AbstractAndroidModule;

public class MyModule extends AbstractAndroidModule {

    @Override
    protected void configure() {

        bind(IShape.class).annotatedWith(Rectangle.class).to(MyRectangle.class);

        bind(IShape.class).annotatedWith(Square.class).to(MySquare.class);

    }
}