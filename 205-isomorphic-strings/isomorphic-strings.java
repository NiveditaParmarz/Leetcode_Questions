class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> mapS_To_T = new HashMap<>();
        HashMap<Character,Character> mapT_To_S = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
        
            // if(sChar==tChar)continue;
            if(mapS_To_T.containsKey(sChar)==true){
                if(mapS_To_T.get(sChar) == tChar)continue;
                else return false;
            }
                
                if(mapT_To_S.containsKey(tChar)==true){
                    return false;
                }
            
            mapS_To_T.put(sChar,tChar);
            mapT_To_S.put(tChar,sChar);
    
        }
        return true;
    }
}