package com.ramazan;

import com.ramazan.HesapMakinasiOrnek;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ramazan on 6.04.2017.
 */
public class HesapMakinasiTest {
    HesapMakinasiOrnek ornek = new HesapMakinasiOrnek();

    @Test
    public void testTopla() {
        int sonuc = ornek.topla(4, 6);
        assertEquals(10, sonuc);
    }

    @Test
    public void testCikart() {
        int cikan = ornek.cikart(15, 2);
        assertEquals(cikan, 13);
    }
}
