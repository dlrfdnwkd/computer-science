class Solution {
    public String solution(String[] seoul) {
        final String keyword = "Kim";
        final String answerTemplate = "김서방은 %d에 있다";
        int index = -1;

        for (int i = 0; i < seoul.length; i++) {
            if (keyword.equals(seoul[i])) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("Kim is not in the array");
        }

        return String.format(answerTemplate, index);
    }
}
