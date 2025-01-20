class Solution {
    public int largestRectangleArea(int[] heights) {
        int SEright[] = smallestEleRight(heights);
        int SEleft[] = smallestEleLeft(heights);
        int maxArea = Integer.MIN_VALUE;

        for(int i = 0; i < heights.length; i++){
            int x1 = SEright[i]-1;
            int x2 = SEleft[i]+1;
            int height = heights[i];
            int width = x1-x2+1;
            int currArea = height*width;
            maxArea = Math.max(maxArea,currArea);

        }

        return maxArea;    
    }

    public int[] smallestEleRight(int arr[]){
        Stack <Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                int idx = st.pop();
                ans[idx] = i;
            }
             st.push(i);
        }

        while(st.size() > 0){
            int idx = st.pop();
            ans[idx] = arr.length;
        }        
        return ans;
    }

    public int[] smallestEleLeft(int arr[]){
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                int idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }

        while(st.size() > 0){
            int idx = st.pop();
            ans[idx] = -1;
        }
        return ans;
    }
}