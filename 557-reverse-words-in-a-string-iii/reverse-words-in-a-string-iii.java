class Solution {
    public String reverseWords(String s) {
        String strArr[] = s.split(" ");
        for(int i = 0; i < strArr.length; i++){
            String str = strArr[i];
            String newStr = reverseString(str);
            strArr[i] = newStr;
        }
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(String S:strArr){
            str.append(S);
            if(count!=strArr.length-1)str.append(" ");
            count++;
        }

        return str.toString();
    }

    public String reverseString(String s){
        StringBuilder newStr = new StringBuilder();
        int idx = 0;
        for(int i = s.length()-1; i >= 0; i--){
            newStr.append(s.charAt(i));
            idx++;    
        }
        return newStr.toString();
    }
}