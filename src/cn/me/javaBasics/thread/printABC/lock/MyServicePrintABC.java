package cn.me.javaBasics.thread.printABC.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 线程 A
class ThreadA extends Thread {
    private MyServicePrintABC service;
    public ThreadA(MyServicePrintABC service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.awaitA();
    }
}

// 线程 B
class ThreadB extends Thread {
    private MyServicePrintABC service;
    public ThreadB(MyServicePrintABC service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.awaitB();
    }
}

// 线程 C
class ThreadC extends Thread {
    private MyServicePrintABC service;
    public ThreadC(MyServicePrintABC service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.awaitC();
    }
}

class MyServicePrintABC {
    private Lock lock = new ReentrantLock();
    int size=10;
    int flag = 1;
    // 使用多个Condition实现通知部分线程
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public Condition conditionC = lock.newCondition();

    public void awaitA() {
            lock.lock();
            try {

                for (int i=0;i<size;i++){
                    while (flag==1){

                        System.out.println("A");
                        conditionB.signalAll();
                        flag=2;
                        conditionA.await();
                        break;
                    }


                }
//

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

    }

    public void awaitB() {
        lock.lock();
        try {

            for (int i=0;i<size;i++){
                while (flag==2){

                    System.out.println("B");

                    conditionC.signalAll();
                    flag=3;
                    conditionB.await();
                    break;
                }



            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitC() {
        lock.lock();
        try {

            for (int i=0;i<size;i++){
                while(flag==3){

                    System.out.println("C");

                    conditionA.signalAll();
                    flag=1;
                    conditionC.await();

                    break;
                }



            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}

// 测试
class Run {
    public static void main(String[] args) throws InterruptedException {
        MyServicePrintABC service = new MyServicePrintABC();

        cn.me.javaBasics.thread.printABC.lock.ThreadA a = new cn.me.javaBasics.thread.printABC.lock.ThreadA(service);
        a.setName("A");
        a.start();

        cn.me.javaBasics.thread.printABC.lock.ThreadB b = new cn.me.javaBasics.thread.printABC.lock.ThreadB(service);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();

    }
}