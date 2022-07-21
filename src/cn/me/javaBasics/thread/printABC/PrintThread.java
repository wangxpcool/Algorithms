package cn.me.javaBasics.thread.printABC;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintThread extends Thread{

    AtomicInteger integer;
    PrintThread(AtomicInteger integer){
        this.integer=integer;
    }

    @Override
    public void run() {

        for (int i=0;i<100;i++){
            while(1==1){
                if (i<100&& integer.get()%3==0){
                    System.out.println("A");
                    integer.incrementAndGet();
                    break;
                }

            }


        }

    }
}
