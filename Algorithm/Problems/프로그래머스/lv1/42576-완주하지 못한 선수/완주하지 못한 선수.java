import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantCount = new HashMap<String, Integer>();

        for (String person : participant) {
            participantCount.put(person, participantCount.getOrDefault(person, 0) + 1);
        }

        for (String person : completion) {
            participantCount.put(person, participantCount.get(person) - 1);
        }

        for (Map.Entry<String, Integer> entry : participantCount.entrySet()) {
            if (entry.getValue() != 0) {
                return entry.getKey();
            }
        }

        return null;
    }
}