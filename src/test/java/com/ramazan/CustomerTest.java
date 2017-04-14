package com.ramazan;

import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ramazan on 14.04.2017.
 */
public class CustomerTest {
    List<String> yurtIciSehirler = new ArrayList<String>(Arrays.asList("Istanbul", "Izmir", "Bursa"));
    List<String> yurtDisiSehirler = new ArrayList<String>(Arrays.asList("Paris", "Londra", "Roma"));

    @Test
    public void testStrings() throws Exception {
    }

    @Test
    public void testListe() throws Exception {
        List<String> sehirler = new ArrayList<String>(Arrays.asList("Istanbul", "Izmir", "Bursa"));

        assertThat(sehirler).contains("Istanbul").doesNotContain("Ankara").containsExactly("Istanbul", "Izmir", "Bursa").doesNotHaveDuplicates();

        List<String> sehirler2 = new ArrayList<String>(Arrays.asList("Istanbul", "Izmir", "Bursa", "Izmir"));
        assertThat(sehirler2).have(yurtIciSehirleri());

        List<String> sehirler3 = new ArrayList<String>(Arrays.asList("Paris", "Londra", "Roma"));
        assertThat(sehirler3).have(yurtDisiSehirler());
        List<String> sehirler4 = new ArrayList<String>(Arrays.asList("Paris", "Londra","Istanbul", "Roma","Bursa"));
        assertThat(sehirler4).haveExactly(2,yurtIciSehirleri()).haveExactly(3,yurtDisiSehirler());
    }

    private Condition<? super String> yurtDisiSehirler() {
        return new Condition<String>() {
            @Override
            public boolean matches(String value) {
                return yurtDisiSehirler.contains(value);
            }
        };
    }

    //condition ile listenin icindeki degerler eslesiyor mu
    private Condition<? super String> yurtIciSehirleri() {
        return new Condition<String>() {
            @Override
            public boolean matches(String value) {
                return yurtIciSehirler.contains(value);
            }
        };
    }
}
