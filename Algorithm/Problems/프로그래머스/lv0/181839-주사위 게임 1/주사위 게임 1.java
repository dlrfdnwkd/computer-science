class Solution {
    public int solution(int a, int b) {
        boolean aIsOdd = a % 2 != 0;
        boolean bIsOdd = b % 2 != 0;

        if (aIsOdd && bIsOdd) {
            return a * a + b * b;
        } else if (!aIsOdd & !bIsOdd) {
            return Math.abs(a - b);
        } else {
            return 2 * (a + b);
        }
    }
}