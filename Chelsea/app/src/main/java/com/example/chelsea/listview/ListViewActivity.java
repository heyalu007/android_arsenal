package com.example.chelsea.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.chelsea.R;

public class ListViewActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mListView = (ListView)findViewById(R.id.lv_1111111);
        mListView.setAdapter(new MyListAdapter(ListViewActivity.this));
        mListView.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this, "点击了", Toast.LENGTH_LONG).show();
            }
        });
    }
}