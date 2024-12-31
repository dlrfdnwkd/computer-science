import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        // 최댓값 경우의 수
        // 1. 가장 큰 두 개의 수 곱
        // 2. 가장 낮은 두 개의 수 곱(음수값 존재)
        int n = numbers.length;
        int largest = numbers[n - 1] * numbers[n - 2];
        int smallest = numbers[0] * numbers[1];

        return Math.max(largest, smallest);
    }
}
