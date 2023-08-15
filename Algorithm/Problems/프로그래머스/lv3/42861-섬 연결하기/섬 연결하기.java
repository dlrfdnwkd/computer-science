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
            System.out.println(Arrays.toString(costs[i]));
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