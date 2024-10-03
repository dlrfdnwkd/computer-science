import java.util.stream.Collectors;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        return s.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .sorted(Comparator.reverseOrder())
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
