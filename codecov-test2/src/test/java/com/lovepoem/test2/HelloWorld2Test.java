package com.lovepoem.test2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorld2Test {

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
        assertEquals("Hello Universe!", subject.getMessage(true));
    }

}
