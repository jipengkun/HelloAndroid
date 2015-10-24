package hack.xin.helloandroid;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ParamActivity extends AppCompatActivity {

    private TextView tv;

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param);

        tv = (TextView) findViewById(R.id.IntentParam);
        Intent i = getIntent();
        tv.setText(i.getStringExtra("data"));

    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param);

        findViewById(R.id.nickbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nickname = (EditText) findViewById(R.id.nickname);
                Intent intent = new Intent();
                intent.putExtra("nickname",nickname.getText().toString());

                setResult(1000,intent);
                finish();
            }
        });

    }

    /**
     * 传递数据 Bundle
     */
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_param);
        System.out.println("ParamActivity onCreate");

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        username.setText(String.format("username is %s",bundle.get("username")));
        password.setText(String.format("password is %s",bundle.get("password")));

    }*/



    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("ParamActivy Onstart");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_param, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
