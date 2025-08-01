class Solution {
    public boolean isPerfectSquare(int num) {
        for(long i = 1; i*i <= num ; i++){
            long prod = i*i;
            if(prod == num)return true;
        }
        return false;
    }
}