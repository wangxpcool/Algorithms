package cn.me.java.base;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class thredme<T> extends Thread{

    public T t;

    public thredme(T t){
        this.t = t;
    }
    @Override
    public void run() {
        ConcurrentHashMap<String,Object> concurrentHashMap = (ConcurrentHashMap)t;
         ((AtomicInteger) concurrentHashMap.get("key")).incrementAndGet(); //step 1
//        concurrentHashMap.put("key", key);//step 2
    }
}
