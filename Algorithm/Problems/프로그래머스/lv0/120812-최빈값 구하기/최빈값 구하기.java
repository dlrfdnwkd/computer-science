import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int mostNumber = -1;
        int maxCount = 0;
        boolean hasSameCount = false;

        for (int number : array) {
            int frequency = countMap.getOrDefault(number, 0) + 1;
            countMap.put(number, frequency);

            if (frequency > maxCount) {
                mostNumber = number;
                maxCount = frequency;
                hasSameCount = false;
            } else if (frequency == maxCount) {
                hasSameCount = true;
            }
        }

        return hasSameCount ? -1 : mostNumber;
    }
}
