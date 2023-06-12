import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        //진출 지점 내림차순 정렬
        Arrays.sort(routes, (int[] a,int[] b) -> a[1] - b[1]);
        //진출 지점보다 클 경우 카메라 증가
        int end = routes[0][1];
        for(int i = 0;i < routes.length;i++) {
            if(end < routes[i][0]) {
                end = routes[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}