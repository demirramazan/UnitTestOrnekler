package com.ramazan;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.*;

/**
 * Created by ramazan on 13.04.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class ParameterTest2 {
    private HesapMakinasiOrnek hesapMakinasi = new HesapMakinasiOrnek();

    @Test
    @Parameters({
            "10,2,20", "15,4,60", "24,4,96"}
    )
    public void testMetreKareJUnitParams(int eni, int boyu, int toplamMetreKare) throws Exception {
        assertEquals(toplamMetreKare, hesapMakinasi.metreKareHesapla(eni, boyu));
    }
}
