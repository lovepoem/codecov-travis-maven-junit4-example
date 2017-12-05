package com.lovepoem.test2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest2 {

    private HelloWorld2 subject;

    @Before
    public void setup() {
        subject = new HelloWorld2();
    }

    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", subject.getMessage(false));
    }

    @Test
    public void testGetMessage2() {
        assertEquals("Hello World!", subject.getMessage(true));
    }

}
