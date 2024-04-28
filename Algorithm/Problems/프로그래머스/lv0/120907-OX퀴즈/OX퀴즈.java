class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] elements = quiz[i].split(" ");
            int expectedValue = Integer.parseInt(elements[4]);
            int resultValue = operateNumber(Integer.parseInt(elements[0]), Integer.parseInt(elements[2]), elements[1]);
            boolean isCorrect = expectedValue == resultValue;
            answer[i] = isCorrect ? "O" : "X";
        }
        return answer;
    }
    
    public int operateNumber(int leftValue, int rightValue, String operator) {
        switch (operator) {
            case "+" :
                return leftValue + rightValue;
            case "-" :
                return leftValue - rightValue;
            default :
                break;
        }
        return 0;
    }
}