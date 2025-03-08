class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int number = i; number <= j;number++) {
            answer += countNumber(number, k);
        }

        return answer;
    }

    public int countNumber(int value, int number) {
        int count = 0;

        while (value > 0) {
            if (value % 10 == number) {
                count++;
            }
            value /= 10;
        }

        return count;
    }
}