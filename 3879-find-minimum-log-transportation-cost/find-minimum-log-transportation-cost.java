class Solution {
    public long minCuttingCost(int n, int m, int k) {

        if(n <= k && m > k){ //solve m
            int len1 = k;
            int len2 = m-k;
            return (long)len1*len2;
        }

        if(m <= k && n > k){ //solve n
            int len1 = k;
            int len2 = n-k;
            return (long)len1*len2;
        }

        return 0;
        
    }
}