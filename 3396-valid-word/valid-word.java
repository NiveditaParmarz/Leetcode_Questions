class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3)return false;
        word = word.toLowerCase();
        // boolean flag = true;
        boolean isConsonent = false;
        boolean isVowel = false;
        for(int i = 0; i < n; i++){
            if(!Character.isLetterOrDigit(word.charAt(i)))return false; 
            if(Character.isLetter(word.charAt(i))){
                char ch = word.charAt(i);
                if(ch =='a'|| ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u'){
                    isConsonent = true;
                }
                else{
                    isVowel = true;
                }
            } 
        }
        if(isConsonent==false || isVowel == false){
            return false;
        }
        return true;
    }
}