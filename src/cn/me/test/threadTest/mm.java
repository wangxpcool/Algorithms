package cn.me.test.threadTest;

import cn.me.javaBasics.base.thredme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mm {

    public static void main(String[] args)  {

        ConcurrentHashMap resultMap = new ConcurrentHashMap();
        int threadSize = 13;
        CountDownLatch countDownLatch = new CountDownLatch(threadSize);

        List<Map<String,Object>> dataOld = new ArrayList<>();
        resultMap.put("data",dataOld);

        ExecutorService executorService =  Executors.newFixedThreadPool(5);
        for (int i =0;i<threadSize;i++){
            executorService.execute(new sing(resultMap,countDownLatch));
        }

//        executorService.shutdown();

//        Thread.sleep(3000);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(((List<Map<String,Object>>)resultMap.get("data")).size());

//        executorService.shutdown();
        return;

    }

}
