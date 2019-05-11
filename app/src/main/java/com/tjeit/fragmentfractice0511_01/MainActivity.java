package com.tjeit.fragmentfractice0511_01;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.tjeit.fragmentfractice0511_01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
