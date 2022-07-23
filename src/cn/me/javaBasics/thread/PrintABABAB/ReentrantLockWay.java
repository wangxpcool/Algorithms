package cn.me.javaBasics.thread.PrintABABAB;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockWay {

    static int number = 0;
    static int number2 = 0;

    public static void main(String[] args) {


        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Condition conditionB = lock.newCondition();
        AtomicInteger atomicInteger;
        new Thread(() -> {

//            for (int i = 1; i <= 10; i++) {
            while (number < 100) {
                lock.lock();
                number++;
                System.out.println("A");

                try {
                    condition.await();
                    conditionB.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }

//            }
        }, "A").start();

        new Thread(() -> {
            while (number2 < 100) {
                number2++;
                lock.lock();
                System.out.println("B");
                condition.signal();
                try {
                    conditionB.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }

        }, "A").start();


    }

}
