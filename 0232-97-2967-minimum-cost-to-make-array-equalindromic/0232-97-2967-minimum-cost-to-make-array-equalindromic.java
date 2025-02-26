class Solution {
    public long minimumCost(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        long mid = nums[n/2];

        long jSp = justSmallerPallindromeLeft(mid);
        long jGp = justGreaterPallindromeRight(mid);
        
        long ans1 = calc1(nums,jSp);
        long ans2 = calc2(nums,jGp);

        return Math.min(ans1,ans2);        
    }

    public long justSmallerPallindromeLeft(long mid){
        long ans = mid;
        while(isPallindrome(ans)==false){
            ans--;
        }
        return ans;
    }
    public long justGreaterPallindromeRight(long mid){
        long ans = mid;
        while(isPallindrome(ans)==false){
            ans++;
        }
        return ans;
    }

    public long calc1(int arr[], long x){
        long sum = 0;
        for(int num:arr){
            sum += Math.abs(num-x);
        }
        return sum;
    }

    public long calc2(int arr[], long x){
        long sum = 0;
        for(int num:arr){
            sum += Math.abs(num-x);
        }
        return sum;
    }

    public boolean isPallindrome(long num){
        long revNum = reverse(num);
        if(num==revNum)return true;
        return false;
    }

    public long reverse(long num){
        long newNum = 0;
        while(num > 0){
            long lastDigit = num%10;
            newNum = (newNum*10)+lastDigit;
            num = num/10;
        }
        return newNum;
    }
}