//package cn.me.test.stu2022.ObjectReflect;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//
//import java.util.Calendar;
//
//public class main {
//
//    public static void main(String[] args) throws ClassNotFoundException {
//
//
//        OTIPA otipa = new OTIPA();
//        otipa.setA("aaa");
//        otipa.setB("bbb");
//
//        String s = JSONObject.toJSON(otipa).toString();
//
//        System.out.println(s);
//        System.out.println(otipa.getClass());
//        System.out.println(OTIPA.class);
//        String className = otipa.getClass().getName();
//        System.out.println(Class.forName(className));
//        Object otipa2 = JSON.parseObject(s, Class.forName(className));
//
//
//        Calendar calendar = Calendar.getInstance();
//
//
//    }
//
//
//}
