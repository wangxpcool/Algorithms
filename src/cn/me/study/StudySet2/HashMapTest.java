package cn.me.study.StudySet2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class HashMapTest {


    public static void main(String[] args) {

        HashMap<String,Object> hashMap = new HashMap<>();

        LinkedHashMap<String,Object> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("test0","test0");

        linkedHashMap.put("test","test");

        linkedHashMap.put("test2","test2");

        System.out.println(linkedHashMap);

        System.out.println(1<<30);

        String key = "123";
        int h;
        int hashv =  (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);

        int x = 3;
        int y = 2;
        System.out.println(x ^ y);


        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(1);hashSet.add(2);hashSet.add(3);hashSet.add(1);
        System.out.println(hashSet);

    }

}
