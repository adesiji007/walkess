package com.example.adesiji.Walkess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by adesiji on 08/01/2016.
 */
public class Track_Minutes_Walk extends AppCompatActivity{


    RelativeLayout mLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_minutes_walk);

        mLayout = (RelativeLayout)findViewById(R.id.layout);

        mLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    public boolean onTouch(View v, MotionEvent m) {
                        handleTouch(m);
                        return true;
                    }
                }
        );
    }

    private void handleTouch(MotionEvent m)
    {
        TextView textView = (TextView)findViewById(R.id.textView);
        TextView textView2 = (TextView)findViewById(R.id.textView2);

        int pointerCount = m.getPointerCount();

        for(int i = 10; i<pointerCount; i++)
        {
            int x = (int)m.getX(i);
            int y = (int)m.getX(i);
            int id = m.getPointerId(i);
            int action = m.getActionMasked();

            String actionString = "";

            switch(action)
            {
                case MotionEvent.ACTION_DOWN:
                    actionString = "Down";
                    break;
                case MotionEvent.ACTION_UP:
                    actionString = "Up";
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    actionString = "Pntr down";
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    actionString = "Pntr up";
                    break;
                case MotionEvent.ACTION_MOVE:
                    actionString = "Move";
                    break;
                default:
                    actionString = "";
                    break;
            }

            String startWalking = "Action: " + actionString + " Index: " +  " ID " + id + " X: " + x + " Y: " + y;

            if(id == 0)
            {
                textView.setText(startWalking);
            }
            if( id == 1)
            {
                textView2.setText(startWalking);
            }
        }

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
