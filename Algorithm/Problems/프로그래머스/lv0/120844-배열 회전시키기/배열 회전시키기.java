class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int shift = "left".equals(direction) ? -1 : 1;
        int[] shifted = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + shift + n) % n;
            shifted[newIndex] = numbers[i];
        }

        return shifted;
    }
}