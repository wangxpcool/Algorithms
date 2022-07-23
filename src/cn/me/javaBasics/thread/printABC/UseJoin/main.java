package cn.me.javaBasics.thread.printABC.UseJoin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> System.out.println("A"));
        Thread thread2 = new Thread(() -> System.out.println("B"));
        Thread thread3 = new Thread(() -> System.out.println("C"));

        thread.join();

        Map map = new HashMap<String, Object>();
        map.put("test", "test");
        System.out.println(map.entrySet());

        Set<Map.Entry> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getKey());
        }


    }

}
