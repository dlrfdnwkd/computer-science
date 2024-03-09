import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        if (!containsValue(words, target)) {
            return answer;
        }
        
        List<Integer> answers = new ArrayList<Integer>();
        boolean[] visited = new boolean[words.length];
        dfs(answers, visited, words, begin, target, 0);
        
        if (answers.isEmpty()) {
            return answer;
        }
        Collections.sort(answers);
        answer = answers.get(0);

        return answer;
    }
    
    public boolean containsValue(String[] values, String target) {
        boolean containsValue = false;
        if (values == null || values.length == 0 || target == null || target.length() == 0) {
            return containsValue;
        }
        for (String value : values) {
            if (value.equals(target)) {
                containsValue = true;
                break;
            }
        }
        return containsValue;
    }
    
    public boolean isDiffOnlyOneChar(String value, String target) {
        boolean isDiffOnlyOneChar = false;
        if (value == null || value.length() == 0 || target == null || target.length() == 0 || value.length() != target.length()) {
            return isDiffOnlyOneChar;
        }
        int diffCount = 0;
        int length = value.length();
        for (int i = 0; i < length; i++) {
            if (value.charAt(i) != target.charAt(i)) {
                diffCount++;
            }
        }
        if (diffCount == 1) {
            isDiffOnlyOneChar = true;
        }
        return isDiffOnlyOneChar;
    }
    
    public void dfs(List<Integer> answers, boolean[] visited, String[] words, String word, String target, int changeCount) {
        if (word.equals(target)) {
            answers.add(changeCount);
            return;
        }
        
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && isDiffOnlyOneChar(word, words[i])) {
                visited[i] = true;
                dfs(answers, visited, words, words[i], target, changeCount + 1);
                visited[i] = false;
            }
        }
    }
}