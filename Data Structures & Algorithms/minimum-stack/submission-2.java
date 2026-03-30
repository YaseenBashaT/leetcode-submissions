class MinStack {
    private Stack<Integer> stack, minStack;
    private int min;
    public MinStack() {
        stack  = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            int top = stack.peek();
            stack.pop();
            if(top == minStack.peek()){
                minStack.pop();
            }
        }
        else return;
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
