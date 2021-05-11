package me.javaBasics.implemetsAndExtends.reflect;

import java.lang.reflect.Proxy;

public class mm {

    public static void main(String[] args) {


        Student student = new StudentImp();
        StudentProxy studentProxy = new StudentProxy();
        studentProxy.setTarget(student);
        Student studentProxys =
                (Student) Proxy.newProxyInstance(
                        student.getClass().getClassLoader(),
                        student.getClass().getInterfaces(),
                        studentProxy);
        studentProxys.fun();

    }

}
