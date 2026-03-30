class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closers = new HashMap<>();
        closers.put(')','(');
        closers.put(']','[');
        closers.put('}','{');

        for(char c:s.toCharArray()){
            if(closers.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek() == closers.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
