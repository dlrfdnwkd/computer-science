import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = new int[0];

        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                break;
            case 4:
                int size = (slicer[1] - slicer[0]) / slicer[2] + 1;
                answer = new int[size];
                int idx = slicer[0];
                for (int i = 0; idx <= slicer[1]; i++, idx += slicer[2]) {
                    answer[i] = num_list[idx];
                }
                break;
        }

        return answer;
    }
}