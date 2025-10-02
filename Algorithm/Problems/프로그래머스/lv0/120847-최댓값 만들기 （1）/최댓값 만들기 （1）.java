class Solution {
    public int solution(int[] numbers) {
        int first = 0;
        int second = 0;

        for (int n : numbers) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second) {
                second = n;
            }
        }

        return first * second;
    }
}