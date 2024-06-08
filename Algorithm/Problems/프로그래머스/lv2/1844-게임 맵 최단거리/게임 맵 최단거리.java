import java.util.Queue;
import java.util.LinkedList;

class Solution {
    class Square {
        int x;
        int y;
        int distance;

        public Square(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public int solution(int[][] maps) {
        int minDistance = Integer.MAX_VALUE;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<Square> queue = new LinkedList<>();

        queue.add(new Square(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Square current = queue.poll();

            // Check if we have reached the bottom-right corner
            if (current.x == maps.length - 1 && current.y == maps[0].length - 1) {
                minDistance = Math.min(minDistance, current.distance);
            }

            // Explore the four possible directions
            for (int i = 0; i < dx.length; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                // Check boundaries
                if (newX < 0 || newY < 0 || newX >= maps.length || newY >= maps[0].length) continue;

                // Check if the new position is walkable and not yet visited
                if (maps[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.offer(new Square(newX, newY, current.distance + 1));
                    visited[newX][newY] = true;
                }
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}