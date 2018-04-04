package com.example.myutillibrary;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yfb on 2018/3/9.
 */

public class ThreadPoolUtil {
    private static ExecutorService fixedThreadPool = Executors.newCachedThreadPool();

    public static ExecutorService getThreadPool(){
        return fixedThreadPool;
    }
}
