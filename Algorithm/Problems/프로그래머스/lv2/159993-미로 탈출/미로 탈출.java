import java.util.LinkedList;
import java.util.Queue;

class Solution {
	private static final char START = 'S';
	private static final char LEVER = 'L';
	private static final char EXIT = 'E';
	private static final char WALL = 'X';

	public int solution(String[] maps) {
		int leverDistance = bfs(maps, START, LEVER);
		if (leverDistance == -1) {
			return -1;
		}

		int exitDistance = bfs(maps, LEVER, EXIT);
		if (exitDistance == -1) {
			return -1;
		}

		return leverDistance + exitDistance;
	}

	private int bfs(String[] maps, char start, char target) {
		boolean[][] visited = new boolean[maps[0].length()][maps.length];
		int[] startPos = findPosition(maps, start);

		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { startPos[0], startPos[1], 0 }); // x, y, distance
		visited[startPos[0]][startPos[1]] = true;

		int[][] directions = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } }; // 상하좌우

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0], y = current[1], distance = current[2];

			if (maps[y].charAt(x) == target) {
				return distance;
			}

			for (int[] dir : directions) {
				int nextX = x + dir[0];
				int nextY = y + dir[1];

				if (isMovable(maps, visited, nextX, nextY)) {
					visited[nextX][nextY] = true;
					queue.add(new int[] { nextX, nextY, distance + 1 });
				}
			}
		}

		return -1;
	}

	private int[] findPosition(String[] maps, char target) {
		for (int y = 0; y < maps.length; y++) {
			for (int x = 0; x < maps[0].length(); x++) {
				if (maps[y].charAt(x) == target) {
					return new int[] { x, y };
				}
			}
		}
		return null;
	}

	private boolean isMovable(String[] maps, boolean[][] visited, int x, int y) {
		return x >= 0 && y >= 0 && x < maps[0].length() && y < maps.length && maps[y].charAt(x) != WALL
				&& !visited[x][y];
	}
}