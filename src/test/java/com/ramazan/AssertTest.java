package com.ramazan;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ramazan on 13.04.2017.
 */
public class AssertTest {

    @Test
    public void testDummy() throws Exception {
        String[] dummy2 = new String[]{"1", "2"};
       // String[] dummy1 = new String[]{"1", "2"};
        String[] dummy1 = new String[]{"1", "2"};
        assertArrayEquals(dummy1, dummy2);
        //Dummy dummy1=new Dummy(12);
        //Dummy dummy2=new Dummy(12);
        //Dummy dummy2=dummy1;

        //assertEquals(dummy1,dummy2);
        //assertSame("dummy1 dummy2 ye esit olmalı",dummy1,dummy2);
        //assertNull("deger null olmali",dummy1);
        //assertTrue(dummy1.equals(dummy2));
        // assertFalse(dummy1.equals(dummy2));
    }

    public static class Dummy {
        private int id;

        public Dummy(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

//        @Override
//        public boolean equals(Object o) {
//            return this.id == ((Dummy) o).getId();
//        }

    }
}
