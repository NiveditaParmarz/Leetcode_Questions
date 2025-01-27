class Solution {
    public String minWindow(String s, String t) {
     
        if(t.length() > s.length())return ""; //empty string returned

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        int sidx = 0;
        int eidx = 0;
        
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }

        int sp = 0;
        int ep = 0;

        int matchCount = 0;

        while(ep < s.length()){
            if(matchCount == t.length()){ //then we will start removing chars from behind, to reduce the length and check.
                if(ep-sp < ans){
                    ans = ep-sp;
                    sidx = sp;
                    eidx = ep;
                }
                
                    smap.put(s.charAt(sp),smap.get(s.charAt(sp))-1);
                    if(smap.get(s.charAt(sp)) < tmap.getOrDefault(s.charAt(sp),0)){
                        matchCount--;
                    }   
                    sp++;
            
            }
            else{
                smap.put(s.charAt(ep),smap.getOrDefault(s.charAt(ep),0)+1);
                if(smap.get(s.charAt(ep)) <= tmap.getOrDefault(s.charAt(ep),0)){
                    matchCount++;
                }
                ep++;
            }

        }

        while(matchCount==t.length()){

            smap.put(s.charAt(sp),smap.get(s.charAt(sp))-1);
            if(smap.get(s.charAt(sp)) < tmap.getOrDefault(s.charAt(sp),0)){
                 matchCount--;
            }

            if(ep-sp < ans){
                ans = ep-sp;
                sidx = sp;
                eidx = ep;
            }

            sp++;
        }

        return s.substring(sidx,eidx);

        
    }
}