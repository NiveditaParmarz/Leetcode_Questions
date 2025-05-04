class Solution {
    public int maxProduct(int n) {
        
   
        // HashMap<Integer,Integer> hm = new HashMap<>();
        
        // while(n > 0){
        //     int rem = n%10;
        //     hm.put(rem,hm.getOrDefault(rem,0)+1);
           
        //     n = n/10;
        // }
        
        // int max = 0;
        // int secMax = -1;
        // for(int key:hm.keySet()){
        //     if(key > max)max = key;
        // }
        // for(int key:hm.keySet()){
        //     if(key < max && key > secMax)secMax = key;
        // }
        // if(hm.get(max) > 1)return max*max;
        // if(hm.get(secMax) > 1){
        //     if(secMax*secMax > max*secMax){
        //         return secMax*secMax;
        //     }
        // }
        
        // return max*secMax;
        
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            int rem = n%10;
            list.add(rem);
            n = n/10;
        }
        Collections.sort(list);
        int length = list.size();
        return list.get(length-1)*list.get(length-2);

        

    }
}