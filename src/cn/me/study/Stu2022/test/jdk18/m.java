package cn.me.study.Stu2022.test.jdk18;

import java.time.LocalDate;
import java.time.ZoneId;

public class m {


    interface Formula{

        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(a);
        }

    }
    public static void main(String[] args) {

        Formula formula  = new Formula() {
            @Override
            public double calculate(int a) {
                return 0;
            }
        };

        Formula formula2  = (a->{return 0;});
        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDate localDate = LocalDate.now();
         System.out.println(localDate.getMonth().getValue());

    }

}
