import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> elements = new ArrayList<Integer>();
        for (int element : arr) {
            if (element % divisor == 0) {
                elements.add(element);
            }
        }
        if (elements.size() == 0) {
            return new int[] { -1 };
        }
        Collections.sort(elements);
        return elements.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}