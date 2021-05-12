package cn.me.java.threadStudy;

public class mainTest {

    public static void main(String args[]) {
//
//        SyncTest s = new SyncTest();
//        Thread t1 = new Thread(s);
//        Thread t2 = new Thread(s);
//
//        t1.start();
//        t2.start();

                for(int i = 0;i<10;i++){

                    SyncTest cc = new SyncTest();
            cc.start();

        }
    }
}
