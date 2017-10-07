package mahlabs.androidstudiol6c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.AttributeSet;

import java.util.Random;

/**
 * Created by 13120dde on 2017-10-06.
 */

public class TextViewCustom extends android.support.v7.widget.AppCompatTextView{

    private int color;

    public TextViewCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void colorize(){
        new ColorChanger().start();
    }

    private void update(){
        post(new Runnable() {
            @Override
            public void run() {
            invalidate();
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas){

        canvas.drawColor(color);
        super.onDraw(canvas);
    }

    private class ColorChanger extends Thread{

        @Override
        public void run() {
            int y =0;
            while(y<200){
                try {
                    Thread.sleep(30);
                    color = Color.argb(255, new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
                    update();
                    y++;

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
