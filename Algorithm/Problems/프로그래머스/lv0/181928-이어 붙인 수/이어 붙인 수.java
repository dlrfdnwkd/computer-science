class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNumber = new StringBuilder();
        StringBuilder evenNumber = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenNumber.append(num);
            } else {
                oddNumber.append(num);
            }
        }

        return Integer.parseInt(oddNumber.toString()) + Integer.parseInt(evenNumber.toString());
    }
}