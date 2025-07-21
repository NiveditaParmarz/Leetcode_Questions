class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 2; i < sb.length();){
            if(sb.charAt(i)==sb.charAt(i-2)&&sb.charAt(i)==sb.charAt(i-1)){
                sb.deleteCharAt(i);
            }
            else{
                i++;
            }
        }

        return sb.toString();
    }
}