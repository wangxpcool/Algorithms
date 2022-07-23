package cn.me.test;

import java.util.ArrayList;
import java.util.List;

public class litest {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1001; i++) {
            list.add(i);
        }

        if (list.size() > 100) {
            for (int j = 0; j < list.size() / 100 + 1; j++) {
                System.out.println(list.subList(j * 100, (j * 100 + 100) < list.size() ? j * 100 + 100 : list.size()));
            }
        } else {
            System.out.println(list);
        }


    }
}
