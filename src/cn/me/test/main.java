package cn.me.test;

import cn.me.study.basicType1.ClassType.ClassAbsract;
import cn.me.study.basicType1.ClassType.ClassActualExtends;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class main {

    public static void main(String[] args) {

        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        String str = new String("abc");
        SoftReference<String> softReference = new SoftReference<>(str, referenceQueue);

        str = null;
        // Notify GC
        System.gc();

        System.out.println(softReference.get()); // abc

        Reference<? extends String> reference = referenceQueue.poll();
        System.out.println(reference); //null

//        Thread.State;
    }

}
