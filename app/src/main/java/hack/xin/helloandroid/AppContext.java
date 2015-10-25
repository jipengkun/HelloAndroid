package hack.xin.helloandroid;

import android.app.Application;

/**
 * Created by shell on 10/25/15.
 */
public class AppContext extends Application{

    private String textData = "HelloAndroid";

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("AppContext onCreate");
    }
}
