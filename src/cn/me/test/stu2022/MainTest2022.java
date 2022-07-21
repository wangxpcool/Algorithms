package cn.me.test.stu2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class MainTest2022 {


    public static void main(String[] args) {

//        fun(Object.class,new ArrayList<Integer>());
        int i=0,j=1;
        if(i<j&&(i>0&&j/i>0)){
            System.out.println(11111);
        }

    }

    static <T> void fun(Class<T> clazz ,List<T> t){
        System.out.println("123"+clazz);
    }


}
