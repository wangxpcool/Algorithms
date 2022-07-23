package cn.me.study.jk18.stream;

import cn.me.publi.StudentEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ma {

    static int a;

    public static void main(String[] args) {

        StudentEntity studentEntity = new StudentEntity("ww", 18, "hh");
        StudentEntity studentEntity2 = new StudentEntity("yy", 19, "f");
        StudentEntity studentEntity3 = new StudentEntity("xx", 32, "hhf");
        StudentEntity studentEntity4 = new StudentEntity("zz", 11, "hsh");

        List<StudentEntity> list = new ArrayList<>();
        list.add(studentEntity);
        list.add(studentEntity2);
        list.add(studentEntity3);
        list.add(studentEntity4);

        System.out.println(list);

//        list.stream().sorted(new Comparator<StudentEntity>() {
//            @Override
//            public int compare(StudentEntity o1, StudentEntity o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        }).forEach(System.out::println);

        list.stream().sorted((a, b) -> a.getAge() - b.getAge()).filter(new Predicate<StudentEntity>() {
            @Override
            public boolean test(StudentEntity studentEntity) {
                return studentEntity.getAge() != 11;
            }
        }).forEach(System.out::println);

        List<Integer> listHandled = list.stream().sorted((a, b) -> a.getAge() - b.getAge()).filter(studentEntity1 -> studentEntity1.getAge() != 11).map(StudentEntity::getAge).collect(Collectors.toList());


        System.out.println(listHandled);

    }

}
