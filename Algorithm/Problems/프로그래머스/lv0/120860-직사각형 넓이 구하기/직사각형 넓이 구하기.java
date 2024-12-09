import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int minX = Arrays.stream(dots).mapToInt(dot -> dot[0]).min().orElseThrow();
        int maxX = Arrays.stream(dots).mapToInt(dot -> dot[0]).max().orElseThrow();
        int minY = Arrays.stream(dots).mapToInt(dot -> dot[1]).min().orElseThrow();
        int maxY = Arrays.stream(dots).mapToInt(dot -> dot[1]).max().orElseThrow();

        return (maxX - minX) * (maxY - minY);
    }
}