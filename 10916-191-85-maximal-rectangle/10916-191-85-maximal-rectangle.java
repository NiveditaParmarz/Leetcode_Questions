class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length; //row length
        int m = matrix[0].length; //col length
        int arr[] = new int[m];
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i==0){
                    arr[j] = matrix[i][j] - '0'; 
                }
                else{
                    if(matrix[i][j]=='0'){
                        arr[j] = 0;
                    }
                    else{
                        arr[j] += matrix[i][j]-'0';
                    }
                }
            }
            int currAns = largestRectangleArea(arr);
            ans = Math.max(ans,currAns); 
        }
        return ans;
        
    }

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