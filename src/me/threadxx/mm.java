package cn.me.threadxx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mm {

    static int ccc = 0;
    public static void main(String[] args) throws InterruptedException {



        List<Integer> list = new ArrayList<>();

        for (int i = 0 ;i<400;i++){

            list.add(i+1);

        }

        Map<String,Object> map = new HashMap<>();
        map.put("list",list);

        int tot  = list.size();

        for (int index = 1;index<=20;index++){
            ThreadSing sing = new ThreadSing(map,(index-1)*20,index*20>tot?tot:index*20);
            sing.start();
        }

        Thread.sleep(5000);
        System.out.println("total="+ccc);

    }
}
