class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sumSquared = 0;

        for (int num : num_list) {
            product *= num;
            sumSquared += num;
        }

        return product < Math.pow(sumSquared, 2) ? 1 : 0;
    }
}