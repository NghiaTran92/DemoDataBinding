package com.nghiatt.demobinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.nghiatt.demobinding.databinding.MainBinding;
import com.nghiatt.demobinding.model.User;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
*http://developer.android.com/intl/vi/tools/data-binding/guide.html
* */
public class MainBindingActivity extends AppCompatActivity {
    private static final String TAG = "MainBindingActivity";
    private MainBinding binding;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("User test text", false);
        binding.setUser(user);
        binding.setHandlers(this);
    }

    public void onClickHappy(View view) {
        Log.e(TAG, "onClickHappy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        user.setName("User unhappy at " + simpleDateFormat.format(new Date()));
        binding.setUser(user);
        user.setIsHappy(false);
    }

    public void onClickUnHappy(View view) {
        Log.e(TAG, "onClickUnHappy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        user.setName("User happy at " + simpleDateFormat.format(new Date()));
        binding.setUser(user);
        user.setIsHappy(true);
    }
}
