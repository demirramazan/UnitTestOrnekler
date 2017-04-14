package com.ramazan;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.assertj.core.groups.Tuple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.extractProperty;

/**
 * Created by ramazan on 14.04.2017.
 */
public class CustomerListTest {
    @Test
    public void testLists() throws Exception {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "ahmet"));
        items.add(new Item(2, "mehmet"));
        items.add(new Item(3, "burak"));
        items.add(new Item(4, "veli"));
        items.add(new Item(5, "veli"));

        assertThat(items).extracting("name").contains("veli", "ahmet");

        assertThat(items).extracting("name","id").contains(Tuple.tuple("ahmet",1),Tuple.tuple("veli",5));

        assertThat(extractProperty("id",int.class).from(items)).containsExactly(1,2,3,4,5);
    }


    @Data
    @AllArgsConstructor
    static class Item {
        private int id;

        private String name;
    }
}
