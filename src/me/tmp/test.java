package cn.me.tmp;

public class test {

    public static void main(String[] args) {

        int a[] = {2,1,4,3,6};
        System.out.println(maxProfit(a));

    }


    public static int maxProfitx (int[] prices,int startIndex,int endIndex) {
        // write code here
        if (startIndex == endIndex)
            return 0;
        int interests = 0;
        int i;int j;
        int temp ;
        for( i=startIndex;i<endIndex-1;i++){
            int start=prices[i];
            for( j=i+1;j<endIndex;j++){
                temp=prices[j]-start;
                if(temp>interests){
                    interests=temp;
                }
            }
        }
        return interests;
    }

    public static int maxProfit (int[] prices) {
        // write code here
        int interests = 0;
        for( int i=0;i<=prices.length-2;i++){
            interests += prices[i+1]>prices[i]? prices[i+1]-prices[i]:0;
        }
        return interests;
    }
}
