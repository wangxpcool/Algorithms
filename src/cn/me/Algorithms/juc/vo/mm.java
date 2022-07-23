package cn.me.Algorithms.juc.vo;

public class mm {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();/*ThreadDemo td2 = new ThreadDemo();new Thread(td2).start();*/
        new Thread(td).start();

        while (true) {
            if (td.isFlag()) {
                System.out.println("------------------");
                break;
            }
        }

    }

}

class ThreadDemo implements Runnable {

    private volatile boolean flag = false;

    @Override
    public void run() {
        System.out.println("xxxxxxxx");
        try {
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
