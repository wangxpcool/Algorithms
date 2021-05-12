package cn.me.al2.juc.test;

public class meTest {


    static volatile Integer  s = 0;

    public synchronized static void main(String[] args) throws InterruptedException {

        synchronized (args){
            for(int i = 0;i<10;i++){

                Tess cc = new Tess();
                cc.start();

            }
        }


        Thread.sleep(2000);
        System.out.println("------"+s);


    }

}

  class Tess extends Thread{

    @Override
    public  void run() {
        synchronized (this){
        }


    }
    public  void fun(int s){

        s++;
        System.out.println(s);
    }
}