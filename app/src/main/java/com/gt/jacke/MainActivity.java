package com.gt.jacke;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(value = R.layout.activity_main)
public class MainActivity extends Activity {
    @ViewInject(value =R.id.tv1)
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }
//http://www.tuicool.com/articles/jQnMRjB



}
