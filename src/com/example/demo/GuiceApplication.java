package com.example.demo;

import java.util.List;

import roboguice.application.RoboApplication;

import com.google.inject.Module;

public class GuiceApplication extends RoboApplication {

	@Override
    public void onCreate() {
	}

	@Override
    protected void addApplicationModules(List<Module> modules) {
        modules.add(new MyModule());
    }

}
