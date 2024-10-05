class Solution {
    public int solution(String s) {

        boolean isNegative = s.charAt(0) == '-';
        int startIdx = (isNegative || s.charAt(0) == '+') ? 1 : 0;

        int result = Integer.parseInt(s.substring(startIdx));
        return isNegative ? -result : result;
    }
}