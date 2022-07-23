package cn.me.javaBasics.mapInThread.ThreadLocalTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrrentHapTest {

    //    ThreadLocal<ConcurrentHashMap<String, Integer>> map = new ThreadLocal<>();
    volatile static Integer integer = 1;

    public static void main(String[] args) throws InterruptedException {


        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 1000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    integer++;

                }

            });
        }
        Thread.sleep(3000); //模拟等待执行结束
        System.out.println("------" + integer + "------");
        executorService.shutdown();
    }


}
