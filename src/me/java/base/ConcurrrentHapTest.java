package cn.me.java.base;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrrentHapTest {

        public static void main(String[] args) throws InterruptedException {
            ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String,Integer>();
            map.put("key", 1);
            ExecutorService executorService = Executors.newFixedThreadPool(100);
            for (int i = 0; i < 1000; i++) {
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        int key = map.get("key") + 1; //step 1
                        map.put("key", key);//step 2
                    }
                });
            }
            Thread.sleep(3000); //模拟等待执行结束
            System.out.println("------" + map.get("key") + "------");
            executorService.shutdown();
        }



}
