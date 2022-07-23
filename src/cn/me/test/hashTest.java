package cn.me.test;

public class hashTest {


    public static void main(String[] args) {
        String s = "11";
        System.out.println(s.hashCode());
        final int hh;
        hh = 1;
        Objj objj = new Objj();

        final int[] iArr = {1, 2, 3, 4};
        iArr[2] = -3;//合法
        System.out.println(iArr);

    }

    static class Objj {
        String s;

        final void fun() {
            return;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int hashCode() {
            return 2;
        }
    }

    static class Objj2 extends Objj {
        String s;


        @Override
        public boolean equals(Object obj) {
            return false;
        }


    }

}
