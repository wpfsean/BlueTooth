package com.zhketech.client.phone;

import android.Manifest;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

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
    @OnClick({R.id.bluetooth_btn_layout,R.id.setting_btn_layout,R.id.login_btn_layout,R.id.viewpager_btn_layout})
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

        }
    }
}