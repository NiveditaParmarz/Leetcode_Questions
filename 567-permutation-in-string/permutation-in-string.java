class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String sortedS1 = sortString(s1);

        for(int i = 0; i <= s2.length()-s1.length(); i++){
            String subs = s2.substring(i,(i+s1.length()));
            String sortedSubs = sortString(subs);
    
            if(sortedS1.equals(sortedSubs)){
                return true;
            }
        }
        return false;

    }

    public String sortString(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    
}