package hack.xin.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HackService extends Service {

    private boolean run = false;

    private String data;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        data = intent.getStringExtra("data");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        run = true;

        new Thread() {
            @Override
            public void run() {
                super.run();

                while(run) {
                    System.out.println("默认信息" + data);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }

    @Override
    public void onDestroy() {
        System.out.println("HackService onDestroy");
        super.onDestroy();
        run = false;
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
