class Solution {
    public int solution(int n) {
        if (n % 2 == 0) {
            int m = n / 2;
            return 4 * m * (m + 1) * (2 * m + 1) / 6;
        } else {
            int m = (n + 1) / 2;
            return m * m;
        }
    }
}
