package cn.me.javaBasics.thread.printABC;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class mm {

    public static void main(String[] args) {

        AtomicInteger integer = new AtomicInteger(0);
        PrintThread printThreadA = new PrintThread(integer);
        printThreadA.start();

        PrintThreadB printThreadB = new PrintThreadB(integer);
        printThreadB.start();

        PrintThreadC printThreadC = new PrintThreadC(integer);
        printThreadC.start();

    }

}
