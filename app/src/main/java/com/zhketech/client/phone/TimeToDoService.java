package com.zhketech.client.phone;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.zhketech.client.phone.utils.Logutils;
import com.zhketech.client.phone.utils.TimeDo;

public class TimeToDoService extends Service {
    public TimeToDoService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Logutils.i("TimeToDoService-->onCreate");
        TimeDo.getInstance().init(this, 2 * 1000);
        TimeDo.getInstance().start();
        TimeDo.getInstance().setListern(new TimeDo.Callback() {
            @Override
            public void resultCallback(String result) {
                Logutils.i(result);
            }
        });
    }

    @Override
    public IBinder onBind(Intent intent) {
        Logutils.i("TimeToDoService-->onBind");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Logutils.i("TimeToDoService-->onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Logutils.i("TimeToDoService-->onDestroy");
        super.onDestroy();
    }
}
