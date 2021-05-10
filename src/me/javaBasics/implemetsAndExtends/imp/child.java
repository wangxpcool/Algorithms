package me.javaBasics.implemetsAndExtends.imp;

public class child implements fatherImp,mother{

    @Override
    public void fun() {
        System.out.println("child fun()");
    }

    @Override
    public void fun2() {
        System.out.println("child fun2()");
    }
}
