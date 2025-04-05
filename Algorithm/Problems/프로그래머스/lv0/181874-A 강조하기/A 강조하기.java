class Solution {
    public String solution(String myString) {
        char[] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 'a') {
                charArray[i] = 'A';
            } else if (c != 'A') {
                charArray[i] = Character.toLowerCase(c);
            }
        }

        return new String(charArray);
    }
}
