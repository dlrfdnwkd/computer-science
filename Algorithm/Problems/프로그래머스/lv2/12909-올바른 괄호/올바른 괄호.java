import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        
        for(int i = 0;i < length;i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty() || stack.pop() != '(') {
                    answer = false;
                    break;
                }
            }
        }
        
        if(!stack.isEmpty()) answer = false;
        
        return answer;
    }
}