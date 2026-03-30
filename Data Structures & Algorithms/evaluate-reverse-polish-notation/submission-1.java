class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String n : tokens){
            if(n.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(n.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }else if(n.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(n.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(n));
            }
        }
        return stack.peek();
    }
}
