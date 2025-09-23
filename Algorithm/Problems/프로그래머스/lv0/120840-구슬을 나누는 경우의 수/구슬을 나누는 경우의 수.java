class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public int combination(int size, int count) {
        if (size == count || count == 0) {
            return 1;
        }

        return combination(size - 1, count - 1) + combination(size - 1, count);
    }
}