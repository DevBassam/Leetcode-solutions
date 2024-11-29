class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String opened = "({[";
        String closed = ")}]";
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (opened.indexOf(current) != -1) { 
                stack.push(current);
            } else {
                if (stack.isEmpty() || closed.indexOf(current) != opened.indexOf(stack.pop())) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
}
