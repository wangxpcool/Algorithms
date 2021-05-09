package me.study.StudySet2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList();

        for (int i=0;i<10;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Integer a[] = {1,2,3};
        List c = Arrays.asList(a);
        c.add(4);
        System.out.println(c);

//        Iterator<Integer> iterator = arrayList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }





    }

}
