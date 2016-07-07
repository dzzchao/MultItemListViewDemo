package com.dzzchao.multitemlistviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dzzchao.multitemlistviewdemo.adapter.MyAdapter;
import com.dzzchao.multitemlistviewdemo.bean.DataBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataBean> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initData() {
        mDataList = new ArrayList<DataBean>();
        mDataList.add(new DataBean(0,"AAA","18"));
        mDataList.add(new DataBean(1,"BBB","19"));
        mDataList.add(new DataBean(0,"CCC","20"));
        mDataList.add(new DataBean(0,"DDD","18"));
        mDataList.add(new DataBean(1,"EEE","19"));
        mDataList.add(new DataBean(0,"GGG","20"));
        mDataList.add(new DataBean(0,"HHH","18"));
        mDataList.add(new DataBean(1,"JJJ","19"));
        mDataList.add(new DataBean(0,"KKK","20"));
    }

    private void initView() {
        ListView listView = (ListView) findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter(this,mDataList);
        listView.setAdapter(myAdapter);
    }

}