package cn.me.al2.sort;

import java.util.Arrays;

public class QuickSort2022 {

    public static void main(String[] args) {


        int a[] = {5,3,7,2,1,7,4};
        partition(a,0,a.length-1);


    }
    static int partition(int a[],int l,int h){
        if (l>=h)
            return 0;
        int pv = a[h];
        int i = l;
        for (int j=l;j<h;j++){
            if (a[j]<pv){
                swap(a,j,i);
                i++;
//                System.out.println(Arrays.toString(a)+"i="+i);
            }
        }
        swap(a,h,i);
        System.out.println(Arrays.toString(a)+"i="+i);
        partition(a,l,i-1);
        partition(a,i+1,h);
        return 0;
    }
    static void swap(int a[],int l,int h){
        int temp = a[l];
        a[l]=a[h];
        a[h]=temp;
    }


}
