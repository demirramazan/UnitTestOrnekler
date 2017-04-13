package com.ramazan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by ramazan on 13.04.2017.
 */
@RunWith(Parameterized.class)
public class ParameterTest {
    HesapMakinasiOrnek hesapMakinasi = new HesapMakinasiOrnek();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10,2,20},
                {20,2,40},
                {24,2,48}
        });
    }

    private int eni;
    private int boyu;
    private int toplamMetreKare;

    public ParameterTest(int eni, int boyu, int toplamMetreKare) {
        this.eni = eni;
        this.boyu = boyu;
        this.toplamMetreKare = toplamMetreKare;
    }

//    @Test
//    public void testMetreKare() throws Exception {
//        assertEquals(20, hesapMakinasi.metreKareHesapla(10, 2));
//    }
    @Test
    public void testMetreKare2() throws Exception {
        assertEquals(toplamMetreKare, hesapMakinasi.metreKareHesapla(eni, boyu));
    }
}
