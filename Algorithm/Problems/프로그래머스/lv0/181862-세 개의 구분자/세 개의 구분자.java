import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<String>();
        StringBuilder temp = new StringBuilder();

        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (temp.length() != 0) {
                    answer.add(temp.toString());
                    temp.setLength(0);
                }
            } else {
                temp.append(c);
            }
        }

        if (temp.length() != 0) {
            answer.add(temp.toString());
        }

        return answer.isEmpty() ? new String[] {"EMPTY"} : answer.toArray(new String[0]);
    }
}