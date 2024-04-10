class Solution {
    public int[] solution(String myString) {
        char regex = 'x';
        boolean isLastCharRegex = myString.charAt(myString.length() - 1) == regex;
        String[] splitedString = myString.split(String.valueOf(regex));
        int[] answer = new int[isLastCharRegex ? splitedString.length + 1 : splitedString.length];
        for (int i = 0; i < splitedString.length; i++) {
            answer[i] = splitedString[i].length();
        }
        if (isLastCharRegex) {
           answer[answer.length - 1] = 0; 
        }
        return answer;
    }
}