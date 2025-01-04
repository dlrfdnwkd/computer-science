import java.util.Set;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (char c : my_string.toCharArray()) {
            if (!vowels.contains(c)) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}