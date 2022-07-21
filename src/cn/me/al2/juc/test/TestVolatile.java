package cn.me.al2.juc.test;

public class TestVolatile {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        System.out.println(Thread.currentThread().getId());
//        new Thread(td).start();
        td.start();
        while(true){
            if(td.isFlag()){
                System.out.println("------------------");
                break;
            }
        }

    }

}

class ThreadDemo extends Thread {

    private    boolean flag = false;

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getId());
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        flag = true;

        System.out.println("flag=" + isFlag());

    }

    public boolean isFlag() {
        return flag;
    }

}
