class Solution {
    public int minPartitions(String n) {

        //The max digit in the whole number will 
        //be the answer,as those many 1s will be required.
        int max = -1;

        for(int i = 0; i < n.length(); i++){
            max = Math.max(max, n.charAt(i)-'0');
        }

        return max;
        
    }
}