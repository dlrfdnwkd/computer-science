import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();

        while (n != 1) {
            answer.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }

        answer.add(n);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}