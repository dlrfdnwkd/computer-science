import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                     .mapToInt(str -> Integer.parseInt(str, s, s + l, 10))
                     .filter(n -> n > k)
                     .toArray();
    }
}