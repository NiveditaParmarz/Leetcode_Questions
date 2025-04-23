class Solution {
    public int countLargestGroup(int n) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int max = 0;
        for(int i= 1; i <= n; i++){
            int sum = sumOfDigits(i);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        int count = 0;
        for(int key:hm.keySet()){
            if(hm.get(key)>max)max = hm.get(key);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)==max)count++;
        }

        return count;


        
    }

    public int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
}