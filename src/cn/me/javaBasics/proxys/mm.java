package cn.me.javaBasics.proxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class mm {

    public static void main(String[] args) {
        StuImp stu = new StuImp();
        InvocationHandler handler = new stuProxy(stu);
        stu stuProxy = (stu)Proxy.newProxyInstance(stu.getClass().getClassLoader(),stu.getClass().getInterfaces(),handler);
        stuProxy.fun();

    }

}
