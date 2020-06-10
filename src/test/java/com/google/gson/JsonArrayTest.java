package com.google.gson;

import org.junit.jupiter.api.Test;

/**
 * @author Liangcheng Juves
 * Created at 2020/6/10 20:28
 */
class JsonArrayTest {

    @Test
    void add() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        JsonArray jsonArray = new JsonArray(a);
        System.out.println(jsonArray);
        jsonArray.add(8);
        System.out.println(jsonArray);
    }
}