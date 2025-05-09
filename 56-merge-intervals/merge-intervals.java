class Solution {
    public int[][] merge(int[][] intervals) {

    Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0])); //lambda operator, we are comparing the first elements of every small arrays.

    List<int[]> ans = new ArrayList<>();

    for(int smallArr[] : intervals){
        if(ans.isEmpty() || ans.get(ans.size()-1)[1] < smallArr[0]){
            ans.add(smallArr);
        }
        else{
            ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],smallArr[1]);
        }
    }

    int size = ans.size();
    int temp[][] = new int[size][];
    int result[][] = ans.toArray(temp);
    return result;




    }
}