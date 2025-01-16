class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        int rowIndex = 0;
        for (String row : picture) {
            StringBuilder scaledRow = new StringBuilder();
            // 가로 늘이기
            for (char value : row.toCharArray()) {
                scaledRow.append(String.valueOf(value).repeat(k));
            }
            // 세로 늘이기
            for (int i = 0; i < k; i++) {
                answer[rowIndex++] = scaledRow.toString();
            }
        }

        return answer;
    }
}