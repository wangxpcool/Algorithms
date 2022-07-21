//package cn.me.test.stu2022.test1;
//
//import java.lang.ref.WeakReference;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class volatileTest {
//
//    static Object lock = "A";
//    static AtomicInteger atomicInteger = new AtomicInteger(0);
//
//
//    public static void main(String[] args) throws InterruptedException {
//
//
//        RejectedExecutionHandler defaultHandler ;
//        PriorityQueue priorityQueue = new PriorityQueue();
//        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue<Runnable>(2);
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
//                (10,15,6000, TimeUnit.MILLISECONDS
//                , new LinkedBlockingQueue<Runnable>(),Executors.defaultThreadFactory(),
//                        defaultHandler
//                );
//
//
//    }
//
//
//
//
//}
