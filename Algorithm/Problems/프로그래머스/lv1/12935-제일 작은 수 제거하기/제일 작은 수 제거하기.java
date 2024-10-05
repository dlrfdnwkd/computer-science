import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);

        return Arrays.stream(arr)
                     .filter(n -> n != min)
                     .toArray();
    }
}