class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        
        for (int element : array) {
            if (n == element) {
                count++;
            }
        }
        
        return count;
    }
}