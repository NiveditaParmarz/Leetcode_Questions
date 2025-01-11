class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if(n==0||n==1)return n;
        mergeSort(arr,0,n-1);
        int maxCount = 1;
        int curele = arr[0];
        int curCount = 1;
        for(int i = 1; i < n; i++){
            if(curele==arr[i])continue;
            
            else if(curele + 1 == arr[i]){
                curCount++;
            }
            else curCount = 1;
            
            curele = arr[i];
            
            maxCount = Math.max(maxCount,curCount);

        }
        return maxCount;
        
    }

    public int[] merge(int arr[], int s, int mid, int e){
        int p1 = s;
        int p2 = mid+1;
        int p3 = 0;
        int n = arr.length;
        int temp[] = new int[e-s+1];
        while(p1 <= mid && p2 <= e){
            if(arr[p1] <= arr[p2]){
                temp[p3] = arr[p1];
                p1++;
                p3++;
            }
            else{
                temp[p3] = arr[p2];
                p2++;
                p3++;
            }
        }
        while(p1 <= mid){
            temp[p3] = arr[p1];
            p1++;
            p3++;
        }
        while(p2 <= e){
            temp[p3] = arr[p2];
            p2++;
            p3++;
        }


        p3 = 0;
        while(s<=e){
            arr[s] = temp[p3];
            s++;
            p3++;
        }

        return arr;
    }

    public void mergeSort(int arr[],int s, int e){
        if(s==e)return;
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);
        
    }
}























