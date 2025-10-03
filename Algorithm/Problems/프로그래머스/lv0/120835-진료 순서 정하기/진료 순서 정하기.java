import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] array = Arrays.copyOf(emergency, length);
        Arrays.sort(array);

        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int rank = length - Arrays.binarySearch(array, emergency[i]);
            answer[i] = rank;
        }

        return answer;
    }
}