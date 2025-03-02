class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int n : array) {
            answer += String.valueOf(n).chars().filter(c -> c == '7').count();
        }

        return answer;
    }
}