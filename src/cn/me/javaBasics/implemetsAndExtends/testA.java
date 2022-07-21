package cn.me.javaBasics.implemetsAndExtends;

import cn.me.javaBasics.implemetsAndExtends.imp.child;

public class testA {

    public static void main(String[] args) {


        int a[] ={1,2,3,4,5,6,7};
        for (int i:a){
            System.out.println(i);
        }
        String s ="";
        s.hashCode();
    }




}
class Main{
    private static int i = 0;

    public synchronized void get(){
        i++;
        System.out.println(i);
    }
}
