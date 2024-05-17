class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countOfP = 0;
        int countOfY = 0;
        char[] arrayOfP = { 'p', 'P'};
        char[] arrayOfY = { 'y', 'Y'};

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (contains(c, arrayOfP)) {
                countOfP++;
            }
            if (contains(c, arrayOfY)) {
                countOfY++;
            }
        }

        if (countOfP != countOfY) {
            answer = false;
        }
        return answer;
    }

    public boolean contains(char target, char[] values) {
        for (char value : values) {
            if (target == value) {
                return true;
            }
        }
        return false;
    }
}