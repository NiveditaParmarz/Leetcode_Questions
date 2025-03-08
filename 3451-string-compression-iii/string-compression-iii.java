class Solution {
    public String compressedString(String word) {
        int n = word.length();
        char ch = word.charAt(0);
        int count = 1;
        StringBuilder ans = new StringBuilder();

        for(int i = 1; i < n; i++){
            char curr = word.charAt(i);
            char prev = word.charAt(i-1);
            if(curr==prev && count < 9){
                count++;
            } 
            else{
                ans.append(count);
                ans.append(ch);
                ch = curr;
                count = 1;
            }
        }

        ans.append(count);
        ans.append(ch);

        return ans.toString();
    }
}