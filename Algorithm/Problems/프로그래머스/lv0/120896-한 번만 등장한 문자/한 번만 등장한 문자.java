import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.entrySet().stream()
                             .filter(e -> e.getValue() == 1)
                             .map(Map.Entry::getKey)
                             .sorted()
                             .map(String::valueOf)
                             .collect(Collectors.joining());
    }
}