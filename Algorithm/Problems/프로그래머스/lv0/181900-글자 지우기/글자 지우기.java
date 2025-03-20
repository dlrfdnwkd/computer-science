class Solution {
    public String solution(String my_string, int[] indices) {
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            charArray[indices[i]] = '0';
        }
        return String.valueOf(charArray).replace("0", "");
    }
}