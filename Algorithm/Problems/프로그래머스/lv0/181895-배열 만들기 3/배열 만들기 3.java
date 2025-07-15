class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len1 = intervals[0][1] - intervals[0][0] + 1;
        int len2 = intervals[1][1] - intervals[1][0] + 1;
        int[] result = new int[len1 + len2];

        System.arraycopy(arr, intervals[0][0], result, 0, len1);
        System.arraycopy(arr, intervals[1][0], result, len1, len2);

        return result;
    }
}