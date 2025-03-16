class Solution {
    public long repairCars(int[] ranks, int cars) {
        long lo = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < ranks.length; i++){
            if(ranks[i]>max)max = ranks[i];
        }
        long hi = (long)max*((long)cars*cars);
        long ans = 0;
        while(lo <= hi){
            long mid = lo + (hi-lo)/2;
            long calcCars = calculateCars(mid,ranks);
            if(calcCars >= cars){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;       
    }

    public long calculateCars(long mid, int ranks[]){
        long calcCars = 0;

        for(int i = 0; i < ranks.length; i++){
            calcCars += (long) Math.sqrt(mid/ranks[i]);
        }

        return calcCars;
        
    }




    //---------------

    // public long repairCars(int[] ranks, int cars) {
    //     long lo = 1;
    //     int max = Integer.MIN_VALUE;
    //     for (int rank : ranks) {
    //         max = Math.max(max, rank);
    //     }
    //     long hi = (long) max * (cars * (long) cars);
    //     long ans = hi;

    //     while (lo <= hi) {
    //         long mid = lo + (hi - lo) / 2;
    //         if (calculateCars(mid, ranks) >= cars) {
    //             ans = mid;
    //             hi = mid - 1;
    //         } else {
    //             lo = mid + 1;
    //         }
    //     }
    //     return ans;
    // }

    // private long calculateCars(long mid, int[] ranks) {
    //     long calcCars = 0;
    //     for (int rank : ranks) {
    //         calcCars += (long) Math.sqrt((double) mid / rank);
    //     }
    //     return calcCars;
    // }


}