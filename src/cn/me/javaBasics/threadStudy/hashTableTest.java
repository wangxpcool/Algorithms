package cn.me.javaBasics.threadStudy;

import java.util.HashMap;

public class hashTableTest {
    static HashMap<Integer, Integer> table = new HashMap<>();
    //分别在两个子线程内对hashtable进行put,get操作
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0;i<100;i++){
            new Thread(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    {
                        System.out.println("线程1执行");
                        for (int i = 0; i < 100000; i++) {
                            table.put(i,i);
                        }
//                        System.out.println("线程1---------" + table.get(i*100000+50000));
                    }

                }
            }).start();



        }
        Thread.sleep(3000);
        System.out.println("线程1---------" + table.get(100009));
        System.out.println("线程1---------" + table.size());

    }
}
