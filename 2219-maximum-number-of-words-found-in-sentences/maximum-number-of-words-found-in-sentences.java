class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            String sent[] = sentences[i].split(" ");
            int len = sent.length;
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}