package com.nghiatt.demobinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nghiatt.demobinding.adapter.RecyclerViewAdapter;
import com.nghiatt.demobinding.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ngh on 11/26/2015.
 */
public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<User> mList;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        // fake
        mList=new ArrayList<>();
        for(int i=0;i<=20;i++){
            mList.add(new User("name "+i));
        }

        mAdapter=new RecyclerViewAdapter(mList);
        mRecyclerView=(RecyclerView)findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        mRecyclerView.setAdapter(mAdapter);

    }
}
