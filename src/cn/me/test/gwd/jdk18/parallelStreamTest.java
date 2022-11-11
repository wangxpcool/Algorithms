package cn.me.test.gwd.jdk18;

import java.util.ArrayList;
import java.util.List;

public class parallelStreamTest {

    public static void main(String[] args) {

        List list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.parallelStream().forEach(i->{
            System.out.println(i);
            System.out.println(i+ ""+i);
        });

    }

}
