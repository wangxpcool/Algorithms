package cn.me.java.proxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class stuProxy implements InvocationHandler {


    Object obj ;

    stuProxy(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Enginner writes document");
        Object res = method.invoke(obj, args);
        return res;
    }
}
