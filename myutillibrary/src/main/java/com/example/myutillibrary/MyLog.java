package com.example.myutillibrary;

import android.util.Log;

/**
 * Created by yfb on 2018/3/8.
 */

public class MyLog {

    public static final boolean DEBUG = true;

    public static void i(String tag,String message){
        if(DEBUG){
            Log.i(tag,message);
        }
    }
}
