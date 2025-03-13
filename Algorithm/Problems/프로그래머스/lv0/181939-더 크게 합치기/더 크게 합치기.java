class Solution {
    public int solution(int a, int b) {
        int prefixA = Integer.parseInt(a + "" + b);
        int prefixB = Integer.parseInt(b + "" + a);
        return Math.max(prefixA, prefixB);
    }
}