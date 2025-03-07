class Solution {
    public long sumDigitDifferences(int[] nums) {

        int numOfDigits = 0;
        int copy = nums[0];
        
        while(copy > 0){
            numOfDigits++;
            copy = copy/10;
        }

        long ans = 0;

        for(int i = 1; i <= numOfDigits; i++){
            int freq[] = new int[10]; //new array will be made for every position(ones tens hundreds posn).
            int div = (int)Math.pow(10,i-1);
            for(int ele:nums){ //just making the freq array for one position at a time.
                ele = ele/div;
                int digit = ele%10;
                freq[digit] = freq[digit]+1;
            }
            ans = ans + calculate(freq);
        }
        return ans;
        
    }

    public long calculate(int arr[]){
        long ans = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i]!=0){
                for(int j = i+1; j < 10; j++){
                    if(arr[j]!=0){
                        ans = ans + ((long)arr[i]*arr[j]);
                    }
                }
            }
        }
        return ans;

    }
}