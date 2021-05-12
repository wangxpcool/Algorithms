package cn.me.second;

import java.util.ArrayList;

public class m {


    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1;i<=50;i++){
            list.add(i);
        }

        System.out.println(list);

        System.out.println(list.subList(0,10));

        int times = list.size()/10;
        for(int i=1;i<=times+1;i++){
            System.out.println(">>>>>"+i);
            System.out.println(list.subList((i-1)*10,Math.min(i*10,list.size())));
        }
        System.out.println(list.subList(0,1));


    }

}
