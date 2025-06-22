import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                     .flatMap(n -> IntStream.generate(() -> n).limit(n))
                     .toArray();
    }
}