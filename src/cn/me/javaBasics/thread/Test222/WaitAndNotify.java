package cn.me.javaBasics.thread.Test222;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;


public class WaitAndNotify {

    private final Object lock = new Object();

    private volatile  List<String> list = new ArrayList<>();

    private final Random random = new Random();

    Logger log;

    public void producer() throws InterruptedException {

        synchronized (lock) {
            while (list.size() == 10) {
                lock.wait();
            }
            list.add(Thread.currentThread().getName().substring(9));
//            if (list.size() == 10) {
                System.out.println(Thread.currentThread().getName()+Arrays.toString(list.toArray(new String[0])));
//            }
            lock.notifyAll();
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (lock) {
            while (list.size() < 10) {
                lock.wait();
            }
            list.clear();
            lock.notifyAll();
        }
    }

    static class MyProducer implements Runnable {

        private final WaitAndNotify waitAndNotify;

        public MyProducer(WaitAndNotify waitAndNotify) {
            this.waitAndNotify = waitAndNotify;
        }

        @Override
        public void run() {
            int i = 10;
            while (i > 0) {
                try {
                    waitAndNotify.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
            }
        }
    }

    static class MyConsumer implements Runnable {

        private final WaitAndNotify waitAndNotify;

        public MyConsumer(WaitAndNotify waitAndNotify) {
            this.waitAndNotify = waitAndNotify;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    waitAndNotify.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Runnable runnable = new MyProducer(waitAndNotify);
        for (int i = 0; i < 20; i++) {
            Thread producer = new Thread(runnable, "producer-" + i);
            producer.start();
        }
        Thread consumer = new Thread(new MyConsumer(waitAndNotify), "consumer");
        consumer.start();
    }
}