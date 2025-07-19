class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean isOddMode = false;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                isOddMode = !isOddMode;
                continue;
            }

            boolean isAppend = (!isOddMode && i % 2 == 0) || (isOddMode && i % 2 != 0);
            if (isAppend) {
                answer.append(c);
            }
        }

        return answer.length() > 0 ? answer.toString() : "EMPTY";
    }
}