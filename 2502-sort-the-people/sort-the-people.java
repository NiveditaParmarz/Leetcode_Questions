class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> ts = new TreeMap<>();
        for(int i = 0; i < names.length; i++){
            ts.put(heights[i],names[i]);
        }
        String arr[] = new String[names.length];
        int idx = names.length-1;
        for(int key : ts.keySet()){
            arr[idx] = ts.get(key);
            idx--;
        }

        return arr;

    }


}