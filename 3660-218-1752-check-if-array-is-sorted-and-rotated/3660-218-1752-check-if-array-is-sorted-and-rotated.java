class Solution {
    public boolean check(int[] nums) {
        int count = 0; //count of breaks, a break is when a number is greater than its next number. There should only be one break, else the array can not be sorted with rotation.
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i]>nums[i+1])count++;
            if(count>1)return false;
        }
        if(nums[n-1]>nums[0]){
            count++;
        }
        if(count>1)return false;
        return true;





        // int sortedArr[] = nums.clone();
        // Arrays.sort(sortedArr);
        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     int freshArr[] = nums.clone(); //resetting the nums array here in every iteration, so that rotation is carried out in original array only

        //     rotate(freshArr,i);
        //     if(Arrays.equals(freshArr,sortedArr) == true){
        //         return true;
        //     }
            
        // }
        // return false;
        
    }

    // public void rotate(int arr[],int k){
    //     int n = arr.length;
    //     if(k > n)k = k%n;
    //     reverse(arr,0,n-1);
    //     reverse(arr,0,k-1);
    //     reverse(arr,k,n-1);
    // }

    // public void reverse(int arr[], int sp, int ep){
    //     while(sp < ep){
    //         int temp = arr[sp];
    //         arr[sp] = arr[ep];
    //         arr[ep] = temp;
    //         sp++;
    //         ep--;
    //     }

    // }


}