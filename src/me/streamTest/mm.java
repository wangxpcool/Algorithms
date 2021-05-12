package cn.me.streamTest;

import java.util.Arrays;
import java.util.List;

public class mm {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "scala", "python", "shell", "ruby");
        long num = list.parallelStream().filter(x -> x.length() < 5).count();
        System.out.println(num);

        System.out.println(list.parallelStream().filter(x -> x.length() < 5));

    }

}
