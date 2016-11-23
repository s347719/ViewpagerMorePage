package com.example.test;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * :com.example.test
 * Created by shuhuan on 2016/11/18.
 */
public class MyApplication extends LitePalApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }

}
