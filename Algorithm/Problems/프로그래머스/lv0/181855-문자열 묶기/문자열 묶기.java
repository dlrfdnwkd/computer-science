import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] strArr) {
        return Arrays.stream(strArr)
                     .collect(Collectors.groupingBy(String::length))
                     .values()
                     .stream()
                     .mapToInt(List::size)
                     .max()
                     .orElse(0);
    }
}