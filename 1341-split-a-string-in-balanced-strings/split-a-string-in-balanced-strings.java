class Solution {
    public int balancedStringSplit(String s) {
        int var = 0;
        int count=0;
        for(int i = 0; i < s.length(); i++){
            // if(i!=0){
            //     if(var==0)count++;
            // }
            if(s.charAt(i)=='R'){
                var++;
            }
            else{
                var--;
            }


            if(var==0)count++;
        }
        
        return count;
        
    }
}