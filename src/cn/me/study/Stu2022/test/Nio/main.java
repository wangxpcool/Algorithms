package cn.me.study.Stu2022.test.Nio;

public class main {



    public static void main(String[] args) {


        String s = "abchhhello";
        byte[] bytes  = s.getBytes();

        fun(bytes);

    }

    private static void fun(byte[] bytes) {
        for (byte b:bytes)
        System.out.println(b);

        String ss = new String(bytes);

        System.out.println(ss);

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
