/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        int mid = lo + (hi-lo)/2;
        while(lo <= hi){
            mid = lo + (hi-lo)/2;
            int val = guess(mid);
            if(val == -1){
                hi = mid-1;
            }
            else if(val == 1){
                lo = mid+1;
            }
            else return mid;
        }
        return mid;
    }
}