class Solution {
    public int[] solution(String[] wallpaper) {
        int lux=Integer.MAX_VALUE;
        int luy=Integer.MAX_VALUE;
        int rdx=Integer.MIN_VALUE;
        int rdy=Integer.MIN_VALUE;

        for (int row = 0; row < wallpaper.length; row++) {
            for (int column = 0; column < wallpaper[row].length(); column++) {
                if (wallpaper[row].charAt(column) == '#') {
                    lux = Math.min(lux, row);
                    rdx = Math.max(rdx, row);
                    luy = Math.min(luy, column);
                    rdy = Math.max(rdy, column);
                }
            }
        }

        // 사각형 범위 조정 - 행렬 끝 범위 포함
        return new int[] {lux, luy, rdx + 1, rdy + 1};
    }
}