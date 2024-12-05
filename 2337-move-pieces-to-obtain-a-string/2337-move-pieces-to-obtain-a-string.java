class Solution {
    public boolean canChange(String start, String target) {
        int i = 0;
        int j = 0;
        int n = start.length();
        
        while(i < start.length() || j < target.length()){
            while(i < n && start.charAt(i)=='_'){ //ignoring the blank spaces
                i++;
            }
            while(j < n && target.charAt(j)=='_'){
                j++;
            }
            
            if(i==n || j==n)return i==n&&j==n;; //as one got finished so obv all characters could not get checkeed in either one of the strings.
            if(start.charAt(i)!=target.charAt(j)){
                return false;
            }
            
            if(start.charAt(i)=='L' && i<j){
               return false;
            }
            if(start.charAt(i)=='R' && j<i){
                return false;
            }
            
            i++;
            j++;  
            
        }
        
        return true;
        
    }
}