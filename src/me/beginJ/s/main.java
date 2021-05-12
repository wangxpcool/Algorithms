package cn.me.beginJ.s;

public class main {

    public static void main(String[] args) {


         Integer  i= 10;
        if((i&1)==1){
            System.out.println("true");
        }

        System.out.println(Integer.toBinaryString(i));
        i = i<<1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);

        i = 10;
        System.out.println(Integer.toBinaryString(i));
        i = i>>1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);

    }
}
