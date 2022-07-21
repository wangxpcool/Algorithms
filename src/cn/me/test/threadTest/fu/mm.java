package cn.me.test.threadTest.fu;

import cn.me.test.threadTest.fu.Sing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class mm {

    public static void main(String[] args) {

        ConcurrentHashMap resultMap = new ConcurrentHashMap();
        int threadSize = 1;

        List<Map<String, Object>> dataOld = new ArrayList<>();
        resultMap.put("data", dataOld);
        Sing sing = new Sing(resultMap);
        FutureTask<String> task = new FutureTask<>(new Sing(resultMap));
        new Thread(task).start();
        try {
            String s = task.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
//        Thread thread = new Thread(task);
//        thread.start();
        System.out.println(222);
    }

}
