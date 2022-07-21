package cn.me.test.simpleAl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {


        List<Map<String,Object>> list = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("ACCNO","a1");
        list.add(map);

        map = new HashMap<>();
        map.put("ACCNO","a2");
        list.add(map);

        map = new HashMap<>();
        map.put("ACCNO","a3");
        list.add(map);
//
//        int loop = 0;
//        int size = list.size();
//        List<Map<String,Object>> result = new ArrayList();
//        for (int page = 1;loop<size;page++){
//
//            int initIndex = loop;
//            int pageSize = 1;
//            String acc = (String) list.get(loop).get("ACCNO");
//            String accNext = acc;
//            while (pageSize<=3&& acc.equals(accNext) && loop<size){
//                if(loop==size-1){
//                    if(pageSize!=1){
//                        loop++;
//                    }
//
//                    break;
//                }
//                loop++;
//                pageSize++;
//                accNext=(String) list.get(loop).get("ACCNO");
//            }
//
//            if(pageSize==1){
//                loop++;
//            }
//            Map<String,Object> map1 = new HashMap<>();
//            map1.put("page",page);
//            map1.put("data",list.subList(initIndex,loop));
//
//            result.add(map1);
//        }

        System.out.println(list.subList(0,1));

        System.out.println(list.subList(0,list.size()));

    }
}
