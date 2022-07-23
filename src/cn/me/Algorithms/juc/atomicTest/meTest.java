package cn.me.Algorithms.juc.atomicTest;


import java.util.Hashtable;

public class meTest {


    static Hashtable<String, Object> map = new Hashtable<>();

    public synchronized static void main(String[] args) throws InterruptedException {

        map.put("key1", 1);

        Tess s = new Tess();
        for (int i = 0; i < 10; i++) {
            new Thread(s).start();
        }

//        Thread t2 = new Thread(s);
//
//        t1.start();


//        for(int i = 0;i<10;i++){
//
//            Tess cc = new Tess();
//            cc.start();
//
//        }

        Thread.sleep(3000);

        System.out.println("final=" + map);

    }

    public static class Tess extends Thread {

        @Override
        public void run() {
            {
                Integer integer = (Integer) map.get("key" + map.size());
                integer++;
                System.out.println(integer);
                map.put("key" + integer, integer);
            }


        }
    }
}
