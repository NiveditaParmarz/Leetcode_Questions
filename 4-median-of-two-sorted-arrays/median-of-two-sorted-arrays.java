class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        if(n1 > n2){ //we always want a to be smaller than b. if not, we will swap the arrays to make a shorter than b.
           return findMedianSortedArrays(b,a);
        } 

        int lo = 0;
        int hi = n1; //not n1-1, n1. which(n1) would be outside the array.But we want that only.
        int t = n1+n2; //total elements

        while(lo <= hi){
            int mid1 = lo + (hi-lo)/2; //mid of 'a' array
            int mid2 = (t+1)/2 - mid1; //these are the elements that are remaining that we want from b array. Remember we wanted to split in half ?? for that.
            
            int am; //a waali array ka mid(yes it is mid1, just checking for one edge case.) 
            if(mid1 == a.length){
                am = Integer.MAX_VALUE;
            } 
            else{
                am = a[mid1]; //told ya, btw we want the element, mid is the index.
            }
            int amm1; //a ke mid element ka pichle waala element
            //checking for 1 edge case. In case mid is 0th index, mid-1 will be -1th index.
            if(mid1==0){
                amm1 = Integer.MIN_VALUE;
            }
            else{
                amm1 = a[mid1-1];
            }
            //-------------
            int bm; //b waali array ka mid(yes it is mid2, just checking for one edge case.) 
            if(mid2 == b.length){
                bm = Integer.MAX_VALUE;
            } 
            else{
                bm = b[mid2]; //told ya, btw we want the element, mid is the index.
            }
            int bmm1; //b ke mid element ka pichle waala element
            //checking for 1 edge case. In case mid is 0th index, mid-1 will be -1th index.
            if(mid2==0){
                bmm1 = Integer.MIN_VALUE;
            }
            else{
                bmm1 = b[mid2-1];
            }

            //------

            if(amm1 <= bm && bmm1 <= am){ //perfect condition! We found median!
                //calculating separately for odd total elements and even.
                if(t%2!=0){ //odd total elements
                    return Math.max(amm1,bmm1);
                }
                else{ //even
                    double lmax = Math.max(amm1,bmm1);
                    double rmin = Math.min(am,bm);
                    return (lmax+rmin)/2;
                }

            }
            else if(amm1 > bm){
                hi = mid1 -1; //a ke element bada hai, toh a ke elements kam gino.

            }
            else if(bmm1 > am){
                lo = mid1 + 1; //a ke aur elements lo, as b ka toh bada hogaya.
            }
        }

        return 0.0;
               
    }
}