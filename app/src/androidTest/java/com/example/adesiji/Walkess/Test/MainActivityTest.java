package com.example.adesiji.Walkess.Test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import com.example.adesiji.Walkess.MainActivity;
import com.example.adesiji.Walkess.R;

/**
 * Created by adesiji on 08/01/2016.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;


    public MainActivityTest(){
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception{
        super.setUp();
        activity = getActivity();
    }
    @SmallTest
    public void testTextViewNotNull(){
        TextView textView = (TextView) activity.findViewById(R.id.textview);
        assertNotNull(textView);
    }
}
