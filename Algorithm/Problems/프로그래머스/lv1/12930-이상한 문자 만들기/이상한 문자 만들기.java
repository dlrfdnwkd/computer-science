class Solution {

    public String solution(String s) {
        int index = 0;
        char[] array = s.toCharArray();
        
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (c == ' ') {
                index = 0;
            } else {
                array[i] = (index % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                index++;
            }
        }
        
        return new String(array);
    }
}