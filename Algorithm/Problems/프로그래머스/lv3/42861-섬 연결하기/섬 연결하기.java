import java.util.Arrays;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parents = new int[n];
        for(int i = 0;i < parents.length;i++) {
            parents[i] = i;
        }
        
        Arrays.sort(costs, (a,b) -> a[2] - b[2]);
        for(int i = 0;i < costs.length;i++) {
            int island1 = costs[i][0];
            int island2 = costs[i][1];
            boolean isCycle = isCycle(parents, island1, island2);
            if(!isCycle) {
                int parent = Math.min(parents[island1], parents[island2]);
                updateParents(parents, parent, parents[island1]);
                updateParents(parents, parent, parents[island2]);
                answer += costs[i][2];
            }
            if(isAllConected(parents)) break;
        }

        return answer;
    }
    
    private boolean isCycle(int[] parents,int a,int b) {
        return parents[a] == parents[b] ? true : false;
    }
    
    private boolean isAllConected(int[] parents) {
        int length = parents.length;
        for(int i = 0;i < length - 1;i++) {
            if(parents[i] != parents[i + 1]) return false;
        }
        return true;
    }
    
    private void updateParents(int[] parents,int parent,int child) {
        int length = parents.length;
        for(int i = 0;i < length;i++) {
            if(parents[i] == child) parents[i] = parent;
        }
    }
}
/*
 * 그 전 통과코드
 */
/*
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int[][] costs) {
        int index,count,answer = index = count = 0;
        boolean[][] check_roads = new boolean[n][n];
        Arrays.sort(costs,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[2] > b[2] ? 1:-1;
            }
        });
        while(count < n-1){
            if(check_road(check_roads,costs[index][0],costs[index][1])){
                check_roads[costs[index][0]][costs[index][1]] = true;
                check_roads[costs[index][1]][costs[index][0]] = true;
                count++;
                answer += costs[index][2];
            }
            index++;
        }
        return answer;
    }
    public boolean check_road(boolean[][] check_roads,int now,int target){
        ArrayList<Integer> check = new ArrayList<>();
        find_road(check,check_roads,now,target,now);
        return check.size() == 0 ? true:false;
    }
    public void find_road(ArrayList<Integer> check,boolean[][] check_roads,int now,int target,int last){
        if(check_roads[now][target]){
            check.add(1);
            return;
        }
        for(int i=0;i<check_roads.length;i++){
            if(i==last || i==now)
                continue;
            if(check_roads[now][i])
                find_road(check,check_roads,i,target,now);
        }
    }
}
*/


