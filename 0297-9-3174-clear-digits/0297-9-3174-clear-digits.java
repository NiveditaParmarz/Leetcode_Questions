class Solution {
    public String clearDigits(String s) {

        int n = s.length();
        Stack <Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            
            if(Character.isDigit(s.charAt(i)) && (!Character.isDigit(st.peek())) ){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            
        }
        
        if(st.size()==0)System.out.println(" ");
        
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop()); // Pop elements and append them to StringBuilder
        }

        return result.reverse().toString();
 
    }

    
}