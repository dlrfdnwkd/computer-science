class Solution {
    public long solution(long num) {
        if (num == 1) {
            return 0;
        }

        for (int i = 0; i < 500; i++) {
            num = doCollatz(num);
            if (num == 1) {
                return i + 1;
            }
        }

        return -1;
    }

    private long doCollatz(long n) {
        return (n % 2 == 0) ? n / 2 : 3 * n + 1;
    }
}