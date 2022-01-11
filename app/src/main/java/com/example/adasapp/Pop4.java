package com.example.adasapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;

public class Pop4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow4);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width =  dm.widthPixels;
        int height =  dm.heightPixels;

        getWindow().setLayout((int)(width *.35), (int)(height *.9));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.END;
        params.x = 200;
        params.y = 20;
        getWindow().setAttributes(params);
    }
}
