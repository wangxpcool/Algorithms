package cn.me.test.gwd.jdk18;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class collectionSort {

    private String name;
    private TypeEnum type;
    private int age;
}

@Getter
enum TypeEnum {

    /**
     * 第一
     */
    First("甲类", 2),
    Second("乙类", 12),
    Three("丙类",0),
    Four("丁类",3),
    ;
    private String desc;
    /**
     * 优先级
     */
    private int priority;

    TypeEnum(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }
}

