import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> suffixes = new ArrayList<String>();
        for (int i = 0; i < my_string.length(); i++) {
            suffixes.add(my_string.substring(i));
        }
        Collections.sort(suffixes);

        return suffixes.toArray(new String[suffixes.size()]);
    }
}