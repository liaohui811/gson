package com.google.gson;

/**
 * @author Liangcheng Juves
 * Created at 2020/6/10 20:26
 */
class JsonObjectTest {

    @org.junit.jupiter.api.Test
    void add() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Liangcheng Juves");
        System.out.println(jsonObject);
    }
}