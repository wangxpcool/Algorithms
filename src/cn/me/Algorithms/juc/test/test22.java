package cn.me.Algorithms.juc.test;

public class test22 {
    volatile static int state = 0;

    static class First extends Thread {
        @Override
        public void run() {
            while (true) {
                if (state % 4 == 0) {
                    System.out.println("1");
                    state++;
                }
            }
        }
    }

    static class Second extends Thread {
        @Override
        public void run() {
            while (true) {
                if (state % 4 == 1) {
                    System.out.println("2");
                    state++;
                }
            }
        }
    }

    static class Third extends Thread {
        @Override
        public void run() {
            while (true) {
                if (state % 4 == 2) {
                    System.out.println("3");
                    state++;
                }
            }
        }
    }

    static class Forth extends Thread {
        @Override
        public void run() {
            while (true) {
                if (state % 4 == 3) {
                    System.out.println("4");
                    state++;
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();
        Third third = new Third();
        Forth forth = new Forth();
        first.start();
        second.start();
        third.start();
        forth.start();

    }
}