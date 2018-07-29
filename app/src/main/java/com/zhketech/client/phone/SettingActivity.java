package com.zhketech.client.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.zhketech.client.phone.utils.MyAdapter;
import com.zhketech.client.phone.utils.MyListView;
import com.zhketech.client.phone.utils.SubAdapter;

/**
 * 設置中心模塊
 */

public class SettingActivity extends AppCompatActivity {
    private MyListView listView;
    private MyListView subListView;
    private MyAdapter myAdapter;
    private SubAdapter subAdapter;

    String cities[][] = new String[][]{
            new String[]{"服務器ip", "服務器端口", "當前用戶", "當前密碼"},
            new String[]{"全部休闲娱乐", "咖啡厅", "酒吧", "茶馆", "KTV"},
            new String[]{"全部购物", "综合商场", "服饰鞋包", "运动户外"}


    };
    String foods[] = new String[]{ "報警設置", "中心服務器設置", "值班室設置"};
    int images[] = new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        init();
        myAdapter = new MyAdapter(getApplicationContext(), foods, images);
        listView.setAdapter(myAdapter);

        selectDefult();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                // TODO Auto-generated method stub
                final int location = position;
                myAdapter.setSelectedPosition(position);
                myAdapter.notifyDataSetInvalidated();
                subAdapter = new SubAdapter(getApplicationContext(), cities, position);
                subListView.setAdapter(subAdapter);
                subListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> arg0, View arg1,
                                            int position, long arg3) {
                        // TODO Auto-generated method stub
                        Toast.makeText(getApplicationContext(), cities[location][position], Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }

    private void init() {
        listView = (MyListView) findViewById(R.id.listView);
        subListView = (MyListView) findViewById(R.id.subListView);
    }

    private void selectDefult() {
        final int location = 0;
        myAdapter.setSelectedPosition(0);
        myAdapter.notifyDataSetInvalidated();
        subAdapter = new SubAdapter(getApplicationContext(), cities, 0);
        subListView.setAdapter(subAdapter);
        subListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), cities[location][position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
