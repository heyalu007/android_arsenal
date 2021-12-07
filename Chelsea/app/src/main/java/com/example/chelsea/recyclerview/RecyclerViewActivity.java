package com.example.chelsea.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.chelsea.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<MyRecyclerViewBean> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        for (int i=0; i<100; i++) {
            MyRecyclerViewBean bean = new MyRecyclerViewBean();
            bean.setName("测试" + i);
            data.add(bean);
        }
        // 设置数据
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view_111);
        MyRecyclerViewAdapter mAdapter = new MyRecyclerViewAdapter(data, this);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setRecyclerItemClickListener(new MyRecyclerViewAdapter.OnRecyclerItemClickListener() {
            @Override
            public void OnRecyclerItemClick(int position) {
                Log.e("heyalu", "OnRecyclerItemClick" + position);
            }
        });

        // 设置布局
//        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        GridLayoutManager mGridLayoutManager = new GridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

    }
}