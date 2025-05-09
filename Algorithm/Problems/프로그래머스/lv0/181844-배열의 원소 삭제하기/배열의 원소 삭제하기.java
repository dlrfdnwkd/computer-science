import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < delete_list.length; i++) {
            set.add(delete_list[i]);
        }

        return Arrays.stream(arr)
                     .filter(n -> !set.contains(n))
                     .toArray();
    }
}
