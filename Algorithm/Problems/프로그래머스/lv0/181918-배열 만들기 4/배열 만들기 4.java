import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        int i = 0;
        while(i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i++]);
                continue;
            }

            if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i++]);
            } else {
                list.remove(list.size() - 1);
            }
        }

        return list.stream()
                   .mapToInt(n -> n)
                   .toArray();
    }
}