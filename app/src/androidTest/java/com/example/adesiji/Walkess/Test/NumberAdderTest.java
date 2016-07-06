package com.example.adesiji.Walkess.Test;

import android.test.suitebuilder.annotation.SmallTest;

import com.example.adesiji.Walkess.NumberAdder;

import junit.framework.TestCase;

/**
 * Created by adesiji on 08/01/2016.
 */
public class NumberAdderTest extends TestCase {

    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }

    @SmallTest
    public void testNumberAdder(){
        int result = NumberAdder.addNumber(2,3);

        assertEquals(5, result);
    }

    @Override
    protected void tearDown() throws Exception{
        super.tearDown();
    }
}
