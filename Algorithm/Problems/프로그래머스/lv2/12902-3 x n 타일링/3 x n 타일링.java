import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final int MOD = 1_000_000_007;

    public long solution(int n) {
        if (n % 2 == 1) {
            return 0; // 홀수는 불가능
        }

        int halfN = n / 2;
        Map<Integer, Long> memo = new HashMap<>();
        memo.put(1, 3L);
        memo.put(2, 11L);

        return computeCases(halfN, memo);
    }

    private long computeCases(int k, Map<Integer, Long> memo) {
        if (memo.containsKey(k)) {
            return memo.get(k);
        }

        long previous = computeCases(k - 1, memo);
        long beforePrevious = computeCases(k - 2, memo);
        long current = (4 * previous % MOD - beforePrevious + MOD) % MOD;

        memo.put(k, current);
        return current;
    }
}