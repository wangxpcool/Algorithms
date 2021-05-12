package cn.me.Algorithms.sort;

public class quickSort {


    public static void main(String[] args) {


        int s[] = {8,3,1,0,10};
        for (int i:s){
            System.out.print(i);
        }

        quickSort(s,0,s.length-1);
        System.out.println();
        for (int i:s){
            System.out.print(i);
        }

    }

    public static void quickSort(int[] arr, int start, int end) {

        //当开始位置小于结束位置时（数组有数据）  进行排序  也就是递归入口
        if (start < end) {
            //首先找到基准数  作为比较的标准数  取数组开始位置   从哪里开始  用哪个数当标准数 这个就是标准数
            int stard = arr[start];
            //记录需要进行排序的下标
            int low = start;
            int high = end;

            //循环比对比标准数大和小的数字
            while (low < high) {
                //如果标准数小于右边的数字  把右边的游标卡尺向左移动
                while (low < high && stard < arr[high]) {
                    high--;
                }
                //如果标准数大于 右边的数字
                //用低位数字替换右边数字
                arr[low] = arr[high];
                //如果左边的数字比标准数小
                while (low < high && arr[low] < stard) {
                    low++;
                }
                //如果左边的数字比标准数大
                //用左边数字替换右边数字
                arr[high] = arr[low];
            }
            //把标准数赋给高或者低所在的元素
            arr[low] = stard;
            //处理所有比标准数小的数字
            quickSort(arr, start, low);
            //处理所有比标准数大的数字
            quickSort(arr, low + 1, end);
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
