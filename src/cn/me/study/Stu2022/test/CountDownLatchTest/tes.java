package cn.me.study.Stu2022.test.CountDownLatchTest;

import java.util.concurrent.CountDownLatch;

public class tes {


    static CountDownLatch countDownLatch = new CountDownLatch(2);

     static Integer integer = 1;

    public static void main(String[] args) {
        new Thread(()->{
            try {
                countDownLatch.await();
                integer++;
                System.out.println("wait end" + integer);
            }catch (InterruptedException e){

            }

        }).start();

        new Thread(()->{
            try {

                integer++;

                System.out.println("countDown "+ integer);
                countDownLatch.countDown();
            }catch (Exception e){

            }

        }).start();


        new Thread(()->{
            try {

                integer++;
                System.out.println("countDown " + integer);
                countDownLatch.countDown();
            }catch (Exception e){

            }

        }).start();
    }

}
