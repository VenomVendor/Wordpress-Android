/*
 * Copyright(c) 2017 - Present, VenomVendor
 * Licensed under GNU AGPLv3
 * Contact : info@VenomVendor.com
 */

package com.venomvendor.app.wordpress.core;

import android.app.Application;
import android.util.Log;

public class WPApplication extends Application {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("wp-android");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("WPApplication", stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
