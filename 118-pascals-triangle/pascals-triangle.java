class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List <Integer> temp = new ArrayList<>(); 
        temp.add(1);
        list.add(temp);

        for(int i = 1; i < numRows; i++){
            List <Integer> currList = new ArrayList<>();
            List<Integer> prevList = list.get(i-1);

            currList.add(1);
            for(int j = 1; j < i; j++){
                int sum = prevList.get(j-1) + prevList.get(j);
                currList.add(sum);
            }
            currList.add(1);
            list.add(currList);

        }

        return list;
       
        
    }
}