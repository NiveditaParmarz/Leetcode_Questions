class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int ans = -1;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==arr[lo] && arr[mid]==arr[hi]){
        
                if(ans==-1 || arr[mid] < arr[ans]){ //if doesn't work, change arr[mid] to arr[lo].
                    ans = mid;
                }
                lo++;
                hi--;
            }
            else if(arr[mid] <= arr[hi]){
                if(ans==-1 || arr[mid] < arr[ans]){
                    ans = mid;
                }
                hi = mid-1;
            }

            else{
                if(ans==-1 || arr[lo] < arr[ans]){
                    ans = lo;
                }
                lo = mid + 1;
            }
        }
        return arr[ans];
        
    }
}