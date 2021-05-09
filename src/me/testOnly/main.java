package me.testOnly;

import me.study.basicType1.ClassType.ClassAbsract;
import me.study.basicType1.ClassType.ClassActualExtends;

public class main {

    public static void main(String[] args) {


        ClassAbsract classAbsract = new ClassActualExtends();
        classAbsract.fun();


//        Exp exp = new Exp();
//        exp.fun("123");

//        ClassA classA = new ClassA();
//        classA.fun();

//        System.out.println(System.getProperties());
//        ClassActual2 classActual2 = new ClassActual2();
//        classActual2.fun();



//        //获取 Person 类的 Class 对象
//        Class clazz= null;
//        try {
//            clazz = Class.forName("me.study.basicType1.reflect.Person");
//
//            //使用.newInstane 方法创建对象
//            Person p=(Person) clazz.newInstance();
//            p.fun();
//            //获取构造方法并创建对象
////            Constructor c=clazz.getDeclaredConstructor(String.class,String.class,int.class);
//            //创建对象并设置属性
////            Person p1=(Person) c.newInstance("李四","男",20);
//
//
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }  catch (InstantiationException e) {
//            e.printStackTrace();
//        }


    }

}
