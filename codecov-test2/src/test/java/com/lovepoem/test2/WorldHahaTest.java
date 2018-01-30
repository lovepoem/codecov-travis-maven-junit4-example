package com.lovepoem.test2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorldHahaTest {
    private WorldHaha subject;

    @Before
    public void setup() {
        subject = new WorldHaha();
    }

    @Test
    public void testGetMessage() {
        assertEquals("WorldHaha small!", subject.getMessage(false));
    }

    @Test
    public void testGetMessage2() {
        assertEquals("WorldHaha big!", subject.getMessage(true));
    }

    @Test
    public void testFail() {
        Assert.assertEquals(true,true);
    }

}
