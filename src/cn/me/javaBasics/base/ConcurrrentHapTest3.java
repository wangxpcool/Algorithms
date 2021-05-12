package cn.me.javaBasics.base;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrrentHapTest3 {

        public  static void main(String[] args) throws InterruptedException {


            ConcurrentHashMap<String, AtomicInteger> map = new ConcurrentHashMap<String,AtomicInteger>();
            AtomicInteger integer = new AtomicInteger(1);
            map.put("key", integer);
            ExecutorService executorService = Executors.newFixedThreadPool(100);
            for (int i = 0; i < 1000; i++) {
                executorService.submit(new thredme<ConcurrentHashMap>(map));

            }
            Thread.sleep(3000); //模拟等待执行结束
            System.out.println("------" + map.get("key") + "------");
            executorService.shutdown();


        }



}
