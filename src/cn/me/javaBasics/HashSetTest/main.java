package cn.me.javaBasics.HashSetTest;

public class main {

    public static void main(String[] args) {
        System.out.println(1111);

        int a[][]={
                {5,3,5,95,1},
                {1,44,15,5,1},
                {8,34,5,25,1},
                {53,3,5,5,15},
        };

        System.out.println(fun(a,0,0,0));

    }

    public static int fun (int a[][],int x,int y,int sum){
        try{
            if(x>4)
                return 999;
            if (y>3)
                return 999;
            if (x==4&&y==3){
                return sum+a[y][x];
            }else{
                sum+=a[y][x];
                return Math.min(fun(a,x+1,y,sum),fun(a,x,y+1,sum));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 999;

    }
}
