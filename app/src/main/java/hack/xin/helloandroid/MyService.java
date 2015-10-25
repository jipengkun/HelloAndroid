package hack.xin.helloandroid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        new Thread() {
            @Override
            public void run() {
                super.run();

                while (true) {
                    System.out.println("service is running......");

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();


        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("service onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        System.out.println("service onDestroy");
    }
}
