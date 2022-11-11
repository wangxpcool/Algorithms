package cn.me.test.gwd.jdk18;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByTest {

    public void  test() {
        List<collectionSort> collectionSorts = new ArrayList<>();
        // 按照type 分组，组内 age 排序
        collectionSorts.add(new collectionSort("张三", TypeEnum.First, 18));
        collectionSorts.add(new collectionSort("赵六", TypeEnum.Second, 25));
        collectionSorts.add(new collectionSort("李四", TypeEnum.Second, 22));
        collectionSorts.add(new collectionSort("张一", TypeEnum.Three, 31));
        collectionSorts.add(new collectionSort("王五", TypeEnum.Four, 45));
        collectionSorts.add(new collectionSort("张二", TypeEnum.Four, 40));
        // 如此分组，treeMap 默认排序会按照 TypeEnum 枚举顺序
        TreeMap<TypeEnum, List<collectionSort>> treeMap = collectionSorts.stream().collect(Collectors.groupingBy(collectionSort::getType, TreeMap::new, Collectors.toList()));
        System.out.println("默认排序：" + treeMap);

        // 如果 treeMap 想要自定义排序，则可以这么做
        TreeMap<TypeEnum, List<collectionSort>> treeMap2 = collectionSorts.stream().collect(Collectors.groupingBy(collectionSort::getType, GroupByTest::getCustomSortTreeMap, Collectors.toList()));

        for (Map.Entry<TypeEnum, List<collectionSort>> entry : treeMap2.entrySet()) {
            entry.getValue().sort(Comparator.comparing(collectionSort::getAge));
        }

        System.out.println("自定义排序:" + treeMap2);

        // 按指定字段分组
        Map<TypeEnum, List<Integer>> map3 = collectionSorts.stream().collect(Collectors.groupingBy(collectionSort::getType,
                Collectors.mapping(collectionSort::getAge, Collectors.toList())));

        System.out.println("按指定字段分组:" + map3);

        TreeMap<TypeEnum, List<collectionSort>> treeMap4 = collectionSorts.stream().sorted(Comparator.comparing(collectionSort::getAge, Comparator.nullsLast(Integer::compareTo)))
                .collect(Collectors.groupingBy(collectionSort::getType, TreeMap::new, Collectors.toList()));
        System.out.println("排序后分组:" + treeMap4);

    }


    public static TreeMap<TypeEnum, List<collectionSort>> getCustomSortTreeMap() {
        return new TreeMap<>(Comparator.comparingInt(TypeEnum::getPriority));
    }
}
