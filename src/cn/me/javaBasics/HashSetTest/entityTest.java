package cn.me.javaBasics.HashSetTest;

import java.util.HashSet;

public class entityTest {

    public static void main(String[] args) {


        Entity entity = new Entity();

        entity.setId("11");
        entity.setName("aa");


        Entity entity2 = new Entity();

        entity2.setId("112");
        entity2.setName("bb");

        HashSet<Entity> set = new HashSet<>();


        set.add(entity);
        System.out.println(set.size());


    }


}
