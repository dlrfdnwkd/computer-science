class Solution {
    private static final int ALPHABET_COUNT = 26;
    private static final char UPPER_A = 'A';
    private static final char UPPER_Z = 'Z';
    private static final char LOWER_A = 'a';
    private static final char LOWER_Z = 'z';

    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            result.append(shiftCharacter(c, n));
        }

        return result.toString();
    }

    private char shiftCharacter(char c, int n) {
        if (c >= UPPER_A && c <= UPPER_Z) {
            return (char) ((c - UPPER_A + n) % ALPHABET_COUNT + UPPER_A);
        }
        if (c >= LOWER_A && c <= LOWER_Z) {
            return (char) ((c - LOWER_A + n) % ALPHABET_COUNT + LOWER_A);
        }
        return c;
    }
}