package com.zhketech.client.phone;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主頁面.用於跳轉到不同的模塊
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.start_services_btn_layout, R.id.bluetooth_btn_layout, R.id.setting_btn_layout, R.id.login_btn_layout, R.id.viewpager_btn_layout})
    public void onclickEvent(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.bluetooth_btn_layout:
                intent.setClass(MainActivity.this, BlueToothActivity.class);
                startActivity(intent);
                break;
            case R.id.setting_btn_layout:
                intent.setClass(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                break;
            case R.id.login_btn_layout:
                intent.setClass(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.viewpager_btn_layout:
                intent.setClass(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
                break;
            case R.id.start_services_btn_layout:

                //  startService(new Intent(MainActivity.this,TimeToDoService.class));
                intent.setClass(MainActivity.this, CameraActivity.class);
                startActivity(intent);
                break;

        }
    }
}