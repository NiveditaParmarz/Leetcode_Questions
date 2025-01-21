class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
         st = new Stack();
         min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
       if(st.size() == 0){
           min = val;
           st.push(0L);
           return;
       }
       long diff = val - min;
        st.push(diff);
        if(val<min){
            min = val;
        }
    
    }
    
    public void pop() {
        long rem = st.pop();
        if(rem<0){
            long val = min;
            min = min - rem;
        } else {
            long val = min + rem;
        }
    }
    
    public int top() {
        long rem = st.peek();
        if(rem < 0){
            long val = min;
            return(int)val;
        } else{
            long val = min + rem;
            return (int)val;
        }
    }
    
    public int getMin() {
        if(st.size()==0) return -1;
        return (int)min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */