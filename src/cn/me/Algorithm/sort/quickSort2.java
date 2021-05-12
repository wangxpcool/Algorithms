package cn.me.Algorithm.sort;


import java.util.HashMap;
import java.util.Map;

public class quickSort2 {


    public static void main(String[] args) {

//        int s[] = {1,1,1,1,1};
//        int s[] = {0,1,3,8,10};
        int s[] = {1, 1, 1, 1, 1,1,1};
        Map[] maps = new Map[s.length];

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            Map map = new HashMap<String, Object>();
            map.put("index", i);
            map.put("key", s[i]);
            maps[i] = map;
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            Map map = maps[i];
            System.out.println(map);
        }
        QuickSort(s, 0, maps.length - 1);

        System.out.println();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

//        quickSort(s,0,s.length-1);
//        System.out.println();
//        for (int i:s){
//            System.out.print(i);
//        }

    }

    private static void QuickSort(int[] num, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }
        //设置最左边的元素为基准值
        int key=num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i=left;
        int j=right;
        while(i<j){
            //j向左移，直到遇到比key小的值
            while(num[j]>=key && i<j){
                j--;
            }
            //i向右移，直到遇到比key大的值
            while(num[i]<=key && i<j){
                i++;
            }
            //i和j指向的元素交换
            if(i<j){
                System.out.println("xxxxxx");
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        num[left]=num[i];
        num[i]=key;
        QuickSort(num,left,i-1);
        QuickSort(num,i+1,right);
    }



    public static void sort(Map[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                Integer valuea = (Integer) (a[i].get("key"));
                Integer valueb = (Integer) (a[j].get("key"));
                if (valuea > valueb) {
                    a[i].put("key", valueb);
                    a[j].put("key", valuea);
                    Integer indexa = (Integer) (a[i].get("index"));
                    Integer indexb = (Integer) (a[j].get("index"));
                    a[i].put("index", indexb);
                    a[j].put("index", indexa);
                }
            }
        }

    }


}
