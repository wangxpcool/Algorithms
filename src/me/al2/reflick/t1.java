package cn.me.al2.reflick;

import java.lang.reflect.Field;

public class t1 {

    public static void main(String[] args) {


        try {


            Class clazz = Class.forName("cn.me.al2.reflick.CodeN");

            Field []field=clazz.getDeclaredFields();

            System.out.println(field[0].get(new String()));

        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
