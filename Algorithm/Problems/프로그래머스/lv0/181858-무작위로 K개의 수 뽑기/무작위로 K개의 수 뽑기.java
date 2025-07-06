import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        int index = 0;
        Set<Integer> set = new HashSet<Integer>();

        for (int num : arr) {
            if (!set.contains(num)) {
                answer[index++] = num;
                set.add(num);
            }

            if (index == answer.length) {
                break;
            }
        }

        return answer;
    }
}