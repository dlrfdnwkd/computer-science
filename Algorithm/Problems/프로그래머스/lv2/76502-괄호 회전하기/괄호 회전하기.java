import java.util.Map;
import java.util.Stack;

class Solution {
    private static final Map<Character, Character> BRACKETS = Map.of(
        ')', '(', 
        ']', '[', 
        '}', '{'
    );

    public int solution(String s) {
        int answer = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (isValidString(s)) {
                answer++;
            }
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    private boolean isValidString(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (BRACKETS.containsValue(c)) {
                stack.push(c);
            } else if (BRACKETS.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != BRACKETS.get(c)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}