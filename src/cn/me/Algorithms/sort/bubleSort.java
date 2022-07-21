package cn.me.Algorithms.sort;

public class bubleSort {


    public static void main(String[] args) {


        int s[] = {8,3,1,0,10};
        for (int i:s){
            System.out.print(i);
        }

        sort(s);
        System.out.println();
        for (int i:s){
            System.out.print(i);
        }

    }
    public static int[] sort(int[]a ){

        for (int i = 0;i<a.length-1;i++){
            for (int j = i;j<a.length;j++){
                if (a[i]>a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;

    }


}
