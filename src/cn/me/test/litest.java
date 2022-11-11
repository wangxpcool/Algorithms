package cn.me.test;

import cn.me.publi.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class litest {

    public static void main(String[] args) {



        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 101; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.stream().filter(integer -> {
            if (integer%2==0){
                return false;
            }
            return true;
        });

        System.out.println(list);

    }
}
