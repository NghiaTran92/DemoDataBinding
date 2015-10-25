package com.nghiatt.demobinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nghiatt.demobinding.databinding.MainBinding;
import com.nghiatt.demobinding.model.User;

/*
*http://developer.android.com/intl/vi/tools/data-binding/guide.html
* */
public class MainBindingActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    MainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    User user = new User("nghia");
    binding.setUser(user);
  }
}
