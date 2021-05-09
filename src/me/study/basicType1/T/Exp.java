package me.study.basicType1.T;

public class Exp<T> {

    public void fun(T t){

        if (t instanceof String){
            System.out.println("sreing "+t);
        }
        if (t instanceof Integer){
            System.out.println("Integer "+t);
        }
        System.out.println(t);

    }

}
