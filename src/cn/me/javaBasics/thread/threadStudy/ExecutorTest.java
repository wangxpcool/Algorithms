package cn.me.javaBasics.thread.threadStudy;

import cn.me.javaBasics.base.thredme;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class ExecutorTest {

    public static void main(String[] args) {

        ExecutorService executorService =  Executors.newFixedThreadPool(1);
        executorService.submit(new thredme<String>(null));

    }

}
