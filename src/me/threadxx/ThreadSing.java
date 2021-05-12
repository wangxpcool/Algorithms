package cn.me.threadxx;

import java.util.List;
import java.util.Map;

import static cn.me.threadxx.mm.ccc;

public class ThreadSing extends Thread{

    Map<String,Object> map ;
    int index;
    int de;
    ThreadSing(Map<String,Object> map,int index,int de){
        this.index=index;
        this.map = map;
        this.de = de;
    }

    @Override
    public void run() {
        List<Integer> list = ( List<Integer>)map.get("list");
        list = list.subList(index,de);
        System.out.println(list);
        ccc++;
    }
}
