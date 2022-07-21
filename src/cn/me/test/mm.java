package cn.me.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mm {


    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();

        for (int i =0;i<100;i++){
            list.add(i+1);
        }
        System.out.println(list);

        System.out.println(list.subList(0,10));

        System.out.println(list.subList(10,20));


        ff ff = new ff();
        ff.fun();

        Map<String,Object> map = new HashMap<>();
        map.put("s",555l+11);
        System.out.println(map.get("s").getClass());

    }



}

class ff{
    int a;
    Boolean b;
    void fun(){

        System.out.println(a);
        System.out.println(b);
    }
}
