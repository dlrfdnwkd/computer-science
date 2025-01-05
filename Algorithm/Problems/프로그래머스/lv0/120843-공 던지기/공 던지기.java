class Solution {
    public int solution(int[] numbers, int k) {
        int length = numbers.length;
        
        if (length % 2 == 0) {
            return numbers[((k - 1) % (length / 2)) * 2];
        }

        int position = (k - 1) % length;
        return numbers[position * 2 % length];
    }
}
