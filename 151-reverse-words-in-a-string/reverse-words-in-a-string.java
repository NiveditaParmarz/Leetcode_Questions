class Solution {
    public String reverseWords(String s) {

        s = s.trim();
        s = s.replaceAll("\\s+", " ");

        String arr[] = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            sb.append(arr[i]);
            if(i!=0)sb.append(" ");
        }

        return sb.toString();
    }
}