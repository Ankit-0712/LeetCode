class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);

        if(minst.isEmpty()|| val <= minst.peek()){
            minst.push(val);
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            int removed = st.pop();
        
        if(removed==minst.peek()){
            minst.pop();
        }
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
       return st.peek();
    }
    
    public int getMin() {
        if(minst.isEmpty()){
            return -1;
        }
        return minst.peek();
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