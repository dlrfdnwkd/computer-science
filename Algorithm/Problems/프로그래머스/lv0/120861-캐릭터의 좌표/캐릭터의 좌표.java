import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        Map<String, int[]> directionMap = new HashMap<String, int[]>();
        directionMap.put("up", new int[]{0, 1});
        directionMap.put("down", new int[]{0, -1});
        directionMap.put("left", new int[]{-1, 0});
        directionMap.put("right", new int[]{1, 0});

        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        int[] answer = {0, 0};

        for (String key : keyinput) {
            int[] direction = directionMap.get(key);
            int movedX = answer[0] + direction[0];
            int movedY = answer[1] + direction[1];

            if (movedX >= -maxX && movedX <= maxX && movedY >= -maxY && movedY <= maxY) {
                answer[0] = movedX;
                answer[1] = movedY;
            }
        }

        return answer;
    }
}
