package com.yeahio.androiddatabinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yeahio.androiddatabinding.R;
import com.yeahio.androiddatabinding.databinding.ActivityMainBinding;
import com.yeahio.androiddatabinding.presenter.IMainActivityPresenter;
import com.yeahio.androiddatabinding.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements IMainActivityView {

    private IMainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        presenter = new MainActivityPresenter();
        presenter.bindUserData(binding);
    }
}
