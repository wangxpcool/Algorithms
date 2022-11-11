package cn.me.test.gwd.jdk18;

import cn.me.publi.StudentEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaTestMap {

    public static void main(String[] args) {

        StudentEntity studentEntity = new StudentEntity("name",1,"cc");
        StudentEntity studentEntity2= new StudentEntity("name2",1,"cc");
        StudentEntity studentEntity3 = new StudentEntity("name3",1,"cc");

        List<StudentEntity> list = new ArrayList();
        list.add(studentEntity);
        list.add(studentEntity2);
        list.add(studentEntity3);

        Map<String,Object> map = list.stream().collect(Collectors.toMap(
             t->t.getName()+"-key",t-> "test",(oldV,newV)->newV
        ));

        System.out.println(map);

    }

}
