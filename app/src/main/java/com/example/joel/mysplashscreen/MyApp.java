package com.example.joel.mysplashscreen;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by joel on 2/15/2018.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(3000);
    }
}
