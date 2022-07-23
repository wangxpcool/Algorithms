package cn.me.javaBasics.thread.printABC;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintThreadC extends Thread {

    AtomicInteger integer;

    PrintThreadC(AtomicInteger integer) {
        this.integer = integer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            while (1 == 1) {
                if (i < 100 && integer.get() % 3 == 2) {
                    System.out.println("c");
                    integer.incrementAndGet();
                    break;
                }

            }

        }

    }
}
