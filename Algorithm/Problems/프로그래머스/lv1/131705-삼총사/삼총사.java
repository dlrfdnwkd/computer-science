class Solution {
    public int solution(int[] number) {
        return combination(number, 0, 0, 0);
    }

    private int combination(int[] number, int index, int limit, int sum) {
        if (limit == 3) {
            return sum == 0 ? 1 : 0;
        }

        int count = 0;
        for (int i = index; i < number.length; i++) {
            count += combination(number, i + 1, limit + 1, sum + number[i]);
        }
        return count;
    }
}