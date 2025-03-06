import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
            .mapToObj(c -> Character.isUpperCase(c) ? 
                          String.valueOf((char) Character.toLowerCase(c)) : 
                          String.valueOf((char) Character.toUpperCase(c)))
            .collect(Collectors.joining());
    }
}
