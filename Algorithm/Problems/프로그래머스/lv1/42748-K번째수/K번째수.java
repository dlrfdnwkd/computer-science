/*
 * stream 이용 시 코드는 간략해지지만 속도는 하위 코드보다 느림
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
                .mapToInt(command -> {
                    int start = command[0] - 1;
                    int end = command[1];
                    int k = command[2] - 1;
                    return Arrays.stream(Arrays.copyOfRange(array, start, end))
                            .sorted()
                            .toArray()[k];
                })
                .toArray();
    }
}
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int index = 0;

        for (int[] command : commands) {
            int start = command[0] - 1;
            int end = command[1]; // 마지막 인덱스는 포함하지 않으므로 -1을 할 이유가 없음
            int k = command[2] - 1;

            int[] subArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(subArray);
            result[index++] = subArray[k];
        }

        return result;
    }
}