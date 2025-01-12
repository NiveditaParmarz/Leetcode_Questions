class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries){
        HashMap <Integer,Integer> m1 = new HashMap<>(); //row
        HashMap <Integer,Integer> m2 = new HashMap<>(); //col
        HashMap <Integer,Integer> m3 = new HashMap<>(); //diagonal (TL to BR)
        HashMap <Integer,Integer> m4 = new HashMap<>(); //diagonal (TR to BL)
        HashMap <Integer,Integer> m5 = new HashMap<>(); //for the actual lamps, their linear indices

        for(int i = 0; i < lamps.length; i++){
            int x = lamps[i][0]; //row index
            int y = lamps[i][1]; //column index
            //we are going to store the positions of the lamps along with the areas they are illuminating.
            m1.put(x,m1.getOrDefault(x,0)+1);
            m2.put(y,m2.getOrDefault(y,0)+1);
            m3.put(x-y,m3.getOrDefault(x-y,0)+1);
            m4.put(x+y,m4.getOrDefault(x+y,0)+1);
            m5.put(x*n+y,m5.getOrDefault(x*n+y,0)+1); //x*n+y is the formula for converting a 2d array elements' index into a linear index
        }        

        int ans[] = new int[queries.length];

        int directions[][] = {{0,0}, {-1,0}, {-1,-1}, {0,1}, {-1,1},{1,1},{1,0},{1,-1},{0,-1}};
         
        for(int i = 0; i < queries.length; i++){
            //now we will check if in the given query, at that position is the area illuminated or not and store it in ans[]
            int x = queries[i][0];
            int y = queries[i][1];
            if(m1.getOrDefault(x,0)>0 || m2.getOrDefault(y,0)>0 || m3.getOrDefault(x-y,0)>0 || m4.getOrDefault(x+y,0)>0){ //if any true, means it is illuminated
                ans[i] = 1; //that query area is illuminated 
            }
        

            for(int d = 0; d < directions.length; d++){ //this loop will check every 8 boxes adjacent to the current query box.
                //we will turn off a lamp.
                int x1 = x + directions[d][0];
                int y1 = y + directions[d][1];
                 if(x1>=0 && y1>=0 && x1<n && y1<n && m5.containsKey(x1*n+y1)==true){
                    int times = m5.get(x1*n+y1);
                     m1.put(x1 , m1.getOrDefault(x1,0)-times);
                     m2.put(y1 , m2.getOrDefault(y1,0)-times);
                     m3.put(x1-y1 , m3.getOrDefault(x1-y1,0)-times);
                     m4.put(x1+y1 , m4.getOrDefault(x1+y1,0)-times);
                     m5.remove(x1*n+y1);
                }

            } 
        }
        
        return ans;
    }
}