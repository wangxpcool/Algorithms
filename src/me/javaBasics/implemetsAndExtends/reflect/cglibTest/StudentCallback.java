//package me.javaBasics.implemetsAndExtends.reflect.cglibTest;
//
//public class StudentCallback implements MethodInterceptor{
//
////    第三方库cglib
////
////    CGLIB是一个功能强大的，高性能、高质量的代码生成库，用于在运行期扩展Java类和实现Java接口。
////
////    它与JDK的动态代理的之间最大的区别就是：
////
////    JDK动态代理是针对接口的，而cglib是针对类来实现代理的，cglib的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。
//
//}
////public class UserServiceCallBack implements MethodInterceptor {
//// 
////          @Override
////  public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
////    System.out.println("start Transaction by cglib");
////    methodProxy.invokeSuper(o, args);
////    System.out.println("end Transaction by cglib");
////    return null;
////  }
//// 
////}