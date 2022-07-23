package cn.me.Algorithms.leetcode.matrx;

class Solution {
    public int[][] generateMatrix(int n) {

        int a[][] = new int[n][n];

        int i = 1;
        int l = 0;
        int r = 0;
        int direct = 0;
        int ltemp;
        int rtemp;
        while (i <= n * n) {
            if (i == 8) {
                System.out.println(111);
            }
            if (a[l][r] == 0) {
                a[l][r] = i;
            } else {
                direct++;
            }


            ltemp = l;
            rtemp = r;

            if (direct == 0 || direct == 4) {
                r++;
                direct = 0;
            } else if (direct == 1) {
                l++;
            } else if (direct == 2) {
                r--;
            } else if (direct == 3) {
                l--;
            }
            try {
                if (a[l][r] != 0) {
                    i--;
                    r = rtemp;
                    l = ltemp;
                    direct++;
                }

            } catch (Exception e) {
                i--;
                r = rtemp;
                l = ltemp;
            }
            i++;

        }
        return a;

    }
}
