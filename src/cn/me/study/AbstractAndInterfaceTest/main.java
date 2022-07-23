package cn.me.study.AbstractAndInterfaceTest;

import java.util.concurrent.Executors;

public class main {


    public static void main(String[] args) {


        Executors.newFixedThreadPool(2);
        Executors.newCachedThreadPool();


    }

    static class MxxUtil {
        static void fun() {
            System.out.println("do some work");
        }
    }

}
