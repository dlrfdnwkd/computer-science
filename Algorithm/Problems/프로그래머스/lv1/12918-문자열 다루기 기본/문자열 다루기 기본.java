class Solution {

    public boolean solution(String s) {
        int length = s.length();
        return (length == 4 || length == 6) && isNumeric(s);
    }

    private boolean isNumeric(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
