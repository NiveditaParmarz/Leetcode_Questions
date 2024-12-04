class Solution {
    public boolean canMakeSubsequence(String str1, String str2){
       
        int i = 0;
        int j = 0;
        
        while(j < str2.length() && i < str1.length()){
    
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
            
            else if(str1.charAt(i)+1 == str2.charAt(j)){
                j++;
            }
            
            else if(str1.charAt(i)=='z' && str2.charAt(j)=='a'){
                j++;
            }
            
            i++;
                
        }
        if(j==str2.length())return true; //if j becomes str2 ki length, that means ki str2 ke saare characters travel hogaye hai meaning that that str2 ke saare characters ke equal kuch mil gaya hai, tabhi aage badhaya j ko jisse wo exhaust ho gaya. 
        return false;
            
        
    }
}