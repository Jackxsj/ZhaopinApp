package com.gt.jacke;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Jack on 2016/4/11.
 */
public class LYJApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        x.Ext.init(this);
    }
}
