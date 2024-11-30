import java.util.Map;

class Solution {
    private static final Map<Character, Integer> CONTROL_MAP = Map.of(
        'w', 1,
        's', -1,
        'd', 10,
        'a', -10
    );

    public int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            n += CONTROL_MAP.getOrDefault(c, 0);
        }
        return n;
    }
}