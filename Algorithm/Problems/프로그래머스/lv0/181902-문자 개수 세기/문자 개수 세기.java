class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int lowerCaseIndex = 26;

        for (char c : my_string.toCharArray()) {
            int index = 0;

            if (Character.isUpperCase(c)) {
                index = c - 'A';
            } else {
                index = 26 + (c - 'a');
            }

            answer[index]++;
        }

        return answer;
    }
}