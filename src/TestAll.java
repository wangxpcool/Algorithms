import java.util.HashMap;

public class TestAll {

    public static void main(String[] args) {


        float ff = 3.4f;

        Integer integer  = 1;
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        short s1 = 1;
//        s1 = s1 +1;
        s1 += 1 ;

        final StringBuilder stringBuilder = new StringBuilder("123");
        System.out.println(stringBuilder);
        stringBuilder.append(11);
        System.out.println(stringBuilder);

        HashMap hashMap = new HashMap();
        hashMap.get("");
        // 报错
//        stringBuilder = new StringBuilder("123123");
    }

}
