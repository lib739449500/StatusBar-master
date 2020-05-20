package com.lb.statusbarmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lb.lbstatusbarlib.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test.getTheName();
        Log.i("lb_Test.addDouble", String.valueOf(Test.addDouble(4,6)));

    }
}
