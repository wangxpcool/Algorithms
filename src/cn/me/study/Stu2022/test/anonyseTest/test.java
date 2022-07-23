package cn.me.study.Stu2022.test.anonyseTest;

import java.io.Serializable;
import java.util.*;

public class test {


    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap();

        map.put("c", "123");
        map.put("b", "222");
        map.put("a", "222");
        fun(map);

        System.out.println(map);

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add("123");
        priorityQueue.add("456");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("c", "123");
        linkedHashMap.put("b", "222");
        linkedHashMap.put("a", "222");

        System.out.println(linkedHashMap);

        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList instanceof AbstractList);
        System.out.println(arrayList instanceof List);
        System.out.println(arrayList instanceof RandomAccess);
        System.out.println(arrayList instanceof Cloneable);
        System.out.println(arrayList instanceof Serializable);

        arrayList.add("tess");
        arrayList.forEach(s -> {
            System.out.println(s);
        });

        HashSet hashSet = new HashSet();
//        hashSet.add();

//        ConcurrentHashMap concurrentHashMap;
//        concurrentHashMap.put()
    }

    private static void fun(HashMap<String, String> map) {
        map.put("????", "nono");
        System.out.println(map);
    }

}
