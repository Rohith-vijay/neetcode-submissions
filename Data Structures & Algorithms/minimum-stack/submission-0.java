class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> ms;
    public MinStack() {
        st= new Stack<>();
        ms=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(ms.isEmpty() || val<=ms.peek())
        ms.push(val);
        else
        ms.push(ms.peek());
    }
    
    public void pop() {
        st.pop();
        ms.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}
