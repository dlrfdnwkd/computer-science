class Solution {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }
        
        long answer = 0;
        long big = Math.max(a, b);
        long small = Math.min(a, b);
        boolean isOdd = (big - small) % 2 == 0;
        // 가우스 계산
        answer = (big + small) * (isOdd ? (big - small) / 2 : (big - small) / 2 + 1);
        if (isOdd) {
            answer += (big + small) / 2;
        }
        return answer;
    }
}