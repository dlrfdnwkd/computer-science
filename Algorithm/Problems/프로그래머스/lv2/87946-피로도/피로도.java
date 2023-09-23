import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int k, int[][] dungeons) {
        List<Integer> list = new ArrayList<>();
        boolean[] checked = new boolean[dungeons.length];
        
        dfs(k, dungeons, checked, 0, list);
        
        Collections.sort(list, Collections.reverseOrder());
        
        return list.get(0);
    }
    public void dfs(int k, int[][] dungeons, boolean[] checked, int count, List<Integer> list){
        for (int i = 0;i < dungeons.length;i++) {
            if (!checked[i] && k >= dungeons[i][0]) {
                checked[i] = true;
                dfs(k - dungeons[i][1], dungeons, checked, count + 1, list);
                checked[i] = false;
            }
        }
        list.add(count);
    }
}