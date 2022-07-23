package cn.me.Algorithms.lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class listTest {

    public static void main(String[] args) {

        ArrayList<Map<String, Object>> maps = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put(i + "", i);
            maps.add(map);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(maps.get(i));
        }

    }

}
