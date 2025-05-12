import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
        }

        for (String name : callings) {
            int idx = indexMap.get(name);
            String frontPlayer = players[idx - 1];

            players[idx - 1] = name;
            players[idx] = frontPlayer;

            indexMap.put(name, idx - 1);
            indexMap.put(frontPlayer, idx);
        }

        return players;
    }
}