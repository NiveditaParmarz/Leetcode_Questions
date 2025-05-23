class Solution {

    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        int n = position.length;
        int lo = minDistance(position);
        int hi = position[n-1] - position[0];
        int ans = -1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            int ballCount = calculateBalls(mid,position);
            if(ballCount >= m){
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }

        }
        return ans;
    }

    public int minDistance(int arr[]){
        int minDis = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-arr[i-1] < minDis){
                minDis = arr[i]-arr[i-1];
            }
        }
        return minDis;
    }

    public int calculateBalls(int mid, int arr[]){

        //mid is the minimum distance between two balls. Now we have to see if that distance is even possible? Are all the m balls going to fit within that span of mid distance b/w each other? How many balls can we fit with this mid as min distance b/w them? That is what we will return.
        
        //kya itna distance long enough hai to fit the balls?
        //kitni cows fit aajeyeingi? is it going to be enough?
        //or less/more distance is required for fitting all the balls?
        int count = 1; //ek ball toh hogi hi.
        int lastPosn = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]-lastPosn >= mid){
                count++;
                lastPosn = arr[i];
            }
        }
        return count;
        

    }
   
}