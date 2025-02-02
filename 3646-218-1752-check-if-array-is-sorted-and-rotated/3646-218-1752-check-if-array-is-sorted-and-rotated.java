class Solution {
    public boolean check(int[] nums) {

        int sortedArr[] = nums.clone();
        Arrays.sort(sortedArr);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int freshArr[] = nums.clone(); //resetting the nums array here in every iteration, so that rotation is carried out in original array only

            rotate(freshArr,i);
            if(Arrays.equals(freshArr,sortedArr) == true){
                return true;
            }
            
        }
        return false;
        
    }

    public void rotate(int arr[],int k){
        int n = arr.length;
        if(k > n)k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    public void reverse(int arr[], int sp, int ep){
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

    }


}