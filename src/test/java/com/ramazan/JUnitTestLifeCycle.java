package com.ramazan;

import org.junit.*;

/**
 * Created by ramazan on 6.04.2017.
 */
public class JUnitTestLifeCycle {

    @BeforeClass
    public static void testClassBefore() {
        System.out.println("class test oncesii..");
    }

    @Before
    public void testMethodBefore() {
        System.out.println("metod oncesii..");
    }

    @Test
    public void testInit() {
        System.out.println("test metodu..");
    }
    @Test
    public void testInit2() {
        System.out.println("test2 metodu..");
    }
    @After
    public void testMethodAfter() {
        System.out.println("metod sonrasii..");
    }
    @AfterClass
    public static void testClassAfter() {
        System.out.println("class test sonrasii..");
    }
}
