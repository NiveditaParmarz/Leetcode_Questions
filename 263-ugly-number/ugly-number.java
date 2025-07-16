class Solution {
    public boolean isUgly(int n) {
        if(n <= 0)return false;
        
        while(n%2==0){
            n = n/2;
        }

        while(n%3==0){
            n = n/3;
        }

        while(n%5==0){
            n = n/5;
        }
        //Jo n ab aayega, wo quotient hoga. Quotient = 1 means pura divide hogaya.
        // toh matlab n agar 2,3 aur 5 se hi divide hoke 1 bana, means uske aur koi factors nahi thhe.
        if(n==1)return true;
        return false;
    }
}