class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (boolean isIncluded : included) {
            if (isIncluded) {
                answer += a;
            }
            a += d;
        }

        return answer;
    }
}