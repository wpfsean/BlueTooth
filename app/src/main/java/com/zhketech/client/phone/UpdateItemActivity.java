package com.zhketech.client.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zhketech.client.phone.utils.MyListAdapter;
import com.zhketech.client.phone.utils.MyListItem;

import java.util.ArrayList;

public class UpdateItemActivity extends AppCompatActivity {
    private ArrayList<MyListItem> list = null;
    private ListView lv;
    private MyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_item);
        intitData();
        lv = (ListView) findViewById(R.id.listView1);
        adapter = new MyListAdapter(list, getApplicationContext());
        adapter.setListView(lv);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                // 获取listview中点击item的数据
                MyListItem item = (MyListItem) parent.getItemAtPosition(position);
                Log.i("eee", item.getData() + " == " + item.getPosition());
                // 更新数据
                item.setData("update item " + position);
                // 更新界面
                adapter.updateItemData(item);
            }
        });

    }

    /**
     * 初始化数据
     */
    private void intitData() {
        list = new ArrayList<MyListItem>();
        for (int i = 0; i < 200; i++) {
            MyListItem item = new MyListItem();
            item.setData("item " + i);
            item.setPosition(i);
            list.add(item);
        }
    }


}