import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int filterIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);

        return Arrays.stream(data).filter(e -> e[filterIndex] < val_ext).sorted((a,b) -> a[sortIndex] - b[sortIndex]).toArray(int[][]::new);
    }

    private int getIndex(String value) {
        switch (value) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
            default: throw new IllegalArgumentException("not supported value:" + value);
        }
    }
}