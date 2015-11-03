package hack.xin.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import hack.xin.helloandroid.R;

/**
 * 创建一个自定义VIEW
 */
public class CustomView extends View {


    public CustomView(Context context) {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }


    /**
     * 点击键盘
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_HOME) {
            Log.i("hacklog", "center clicked");
        }

        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i("CustomView", "CustomView onTouch");
        }

        return super.onTouchEvent(event);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        //旋转画布
        Matrix matrix = new Matrix();
        matrix.setRotate(360);
        canvas.setMatrix(matrix);

        canvas.drawRect(10, 10, 90, 90, paint);

        paint.setColor(Color.BLACK);
        canvas.drawText("Hello Canvs", 20, 20, paint);

        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        canvas.drawOval(20, 20, 120, 120, paint);



    }

}