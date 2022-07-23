package cn.me.test.TestError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TestStackOverFlowError {


    public static void main(String[] args) {

        Random random = new Random();
        ArrayList list = new ArrayList();
        for (int i =0;i<111112522;i++){
            HashMap map = new HashMap();


            map.put(random.nextInt(999) + "", "test");

            map.put(random.nextInt(999) + "", "test");
            list.add(map);
        }

        System.out.println(list);
        System.out.println(list.size());


    }

}
