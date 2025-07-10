class Solution {
    public char kthCharacter(int k) {
        StringBuilder iniWord = new StringBuilder("a");
        while(iniWord.length() < k){
            int len = iniWord.length();
            for(int i = 0; i < len; i++){
                if(iniWord.charAt(i) == 'z'){
                    char toAdd = 'a';
                    iniWord.append(toAdd);
                }
                else {
                    char toAdd = (char)(iniWord.charAt(i)+1);
                    iniWord.append(toAdd);
                }
            }
        }
        
        return iniWord.charAt(k-1);
    }
}