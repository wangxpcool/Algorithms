package cn.me.study.StudyJvm3;

import java.util.HashMap;

public class testStackOverflow {

    public static void main(String[] args) {


//        System.out.println(511311313*1313122231);
//        System.out.println(fun(20344));

        HashMap<String,Object> hashMap  = new HashMap();
        int i = 0;
        while(true){
//            if (i%100==0){
//                System.out.println(hashMap.size());
//            }
            i++;
            hashMap.put(i+"",i);
        }

    }

           //main.testStackOverflowError(c);


    public static void testStackOverflowError(int c) {//StackOverflowError
        System.out.println(c++);//10444
        testStackOverflowError(c);
    }


    static int fun(int a){
        if (a==1){
            return a;
        }
        return a*fun(a-1);
    }

}
