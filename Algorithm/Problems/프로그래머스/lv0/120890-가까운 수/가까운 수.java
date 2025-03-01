import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int number : array) {
            int currentDiff = Math.abs(number - n);

            if (currentDiff < minDiff || (currentDiff == minDiff && number < answer)) {
                minDiff = currentDiff;
                answer = number;
            }
        }
        return answer;
    }
}
