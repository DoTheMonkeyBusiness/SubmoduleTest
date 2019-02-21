package com.example.submoduletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mylib.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyClass.myFunc();
    }
}
