package com.wangzl.module_base;

import android.app.Application;

/**
 * @Author wangzl
 * @Date 2019/1/16 10:21
 * @Description TODO
 */
public class BaseApplication extends Application {
    private final static String TAG = "TamcApplication";

    private static BaseApplication instance;
    //    private Activity mainActivity;
    private String mH5DistPath = "";


    public static synchronized BaseApplication getInstance() {
        return instance;
    }

    public BaseApplication() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
