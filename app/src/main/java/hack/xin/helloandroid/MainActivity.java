package hack.xin.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Main Activity onCreate");

        findViewById(R.id.buttonAnotherActivity).setOnClickListener(new View.OnClickListener(
        ) {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com")));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.print("Main Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Main Activity onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Main Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Main Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Main Activity onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
