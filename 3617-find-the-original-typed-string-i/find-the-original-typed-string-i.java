class Solution {
    public int possibleStringCount(String word) {
        // HashMap<Character,Integer> hm = new HashMap<>();
        // for(int i = 0; i < word.length(); i++){
        //     char ch = word.charAt(i);
        //     hm.put(ch,hm.getOrDefault(ch,0)+1);
        // }
        // int sum = 1;
        // for(char ch : hm.keySet()){
        //     int freq = hm.get(ch);
        //     if(freq > 1){
        //         sum = sum + (freq-1);
        //     }
        // }
        // return sum;
        
        int sum = 1;
        for(int i = 1; i < word.length(); i++){
            char prev = word.charAt(i-1);
            char curr = word.charAt(i);
            if(curr==prev)sum++;
       }
       return sum;


    }
}