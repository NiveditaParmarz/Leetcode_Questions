class Solution {
    public void sortColors(int[] arr){
        // int ones = 0;
        // int zeroes = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i]==1)ones++;
        //     else if(nums[i]==0)zeroes++;
        // }

        // for(int i = 0; i < zeroes; i++){
        //     nums[i] = 0;
        // } 

        // for(int i = zeroes; i < ones+zeroes ; i++){
        //     nums[i] = 1;
        // }
        // for(int i = ones + zeroes; i < nums.length ; i++){
        //     nums[i] = 2;
        // }

//--------------------------



        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while(j <= k){
            if(arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
            else if(arr[j]==1)j++;
            else{ //if arr[j] == 2
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
            }
            
        }

    }
}