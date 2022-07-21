package cn.me.javaBasics.thread.PrintABABAB;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * ReentrantLock結合Condition实现等待/通知，唤醒和等待部分线程
 *
 * @author Administrator
 *
 */
public class Test1111 {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            Thread.sleep(1 * 1000);
            conditionA.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalA() {
        try {
            lock.lock();
            Thread.sleep(1 * 1000);
            conditionA.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            Thread.sleep(1 * 1000);
            conditionB.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalB() {
        try {
            lock.lock();
            Thread.sleep(1 * 1000);
            conditionB.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final Test1111 demo3 = new Test1111();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo3.awaitA();
            }
        }, "threadA").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo3.signalA();
            }
        }, "threadA1").start();
        // 访问conditionB
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo3.awaitB();
            }
        }, "threadB").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo3.signalB();
            }
        }, "threadB1").start();
    }
}