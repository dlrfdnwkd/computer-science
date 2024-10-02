class Solution {
    public int solution(int n) {
        if (n == 0) {
            return 0;
        }

        int bitCount = Integer.bitCount(n);
        int nextNum = n + 1;

        while (bitCount != Integer.bitCount(nextNum)) {
            nextNum++;
        }

        return nextNum;
    }
}