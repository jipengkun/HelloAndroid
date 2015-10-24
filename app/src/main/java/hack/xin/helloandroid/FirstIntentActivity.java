package hack.xin.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by shell on 10/24/15.
 */
public class FirstIntentActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.firstintent);

        findViewById(R.id.firstButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("mySecondActivity");
                startActivity(intent);
            }
        });
    }
}
