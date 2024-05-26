import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        String strN = String.valueOf(n);
        Character[] answer = new Character[strN.length()];
        int index = 0;
        for (char c : strN.toCharArray()) {
            answer[index++] = Character.valueOf(c);
        }
        Arrays.sort(answer, Collections.reverseOrder());
        strN = Arrays.stream(answer).map(String::valueOf).collect(Collectors.joining());
        return Long.parseLong(strN);
    }
}