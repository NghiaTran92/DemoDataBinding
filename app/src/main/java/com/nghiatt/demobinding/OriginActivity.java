package com.nghiatt.demobinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.nghiatt.demobinding.model.User;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OriginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "OriginActivity";

    private Button mClick;
    private TextView mTxtName;
    private ImageView mImgFace;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origin);

        mUser = new User("User test text", false);
        mClick = (Button) findViewById(R.id.btn_click);
        mTxtName = (TextView) findViewById(R.id.txt_name);
        mImgFace = (ImageView) findViewById(R.id.img_status);
        mClick.setOnClickListener(this);
        updateUser(mUser);
    }

    private void updateUser(User user) {
        if (user != null) {
            mTxtName.setText(user.getName());
            mImgFace.setVisibility(user.isHappy() ? View.VISIBLE : View.GONE);

        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_click) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            if (mUser.isHappy()) {
                Log.e(TAG, "onClickHappy");
                mUser.setName("User unhappy at " + simpleDateFormat.format(new Date()));
                mUser.setIsHappy(false);
            } else {
                Log.e(TAG, "onClickUnHappy");
                mUser.setName("User happy at " + simpleDateFormat.format(new Date()));
                mUser.setIsHappy(true);
            }
            updateUser(mUser);
        }
    }
}
