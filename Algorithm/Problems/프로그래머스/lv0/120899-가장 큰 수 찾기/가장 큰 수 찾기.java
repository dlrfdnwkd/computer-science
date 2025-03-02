class Solution {
    public int[] solution(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }

        return new int[] {maxNumber, maxIndex};
    }
}