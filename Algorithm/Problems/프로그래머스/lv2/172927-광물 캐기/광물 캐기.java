import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[][] fatigues = { {1, 1, 1}, {5, 1, 1}, {25, 5, 1} };
        int count = picks[0] + picks[1] + picks[2];
        //5개씩 slice후 피로도 계산
        for (int i = 0; i < minerals.length; i += 5) {
            if(count <= 0) {
                break;
            }
            
            int[] array = new int[3];
            int j = i;
            while (j < minerals.length && j < i + 5) {
                if (minerals[j].equals("diamond")) {
                    array[0] += fatigues[0][0];
                    array[1] += fatigues[1][0];
                    array[2] += fatigues[2][0];
                }
                
                if (minerals[j].equals("iron")) {
                    array[0] += fatigues[0][1];
                    array[1] += fatigues[1][1];
                    array[2] += fatigues[2][1];
                }
                
                if (minerals[j].equals("stone")) {
                    array[0] += fatigues[0][2];
                    array[1] += fatigues[1][2];
                    array[2] += fatigues[2][2];
                }
                j++;
            }
            
            list.add(array);
            count--;
        }
        //돌곡괭이 피로도 내림차순
        Collections.sort(list,new Comparator<int[]> (){
            @Override
            public int compare(int[] a, int[] b) {
                if(a[2] != b[2]) return b[2] - a[2];
                if(a[1] != b[1]) return b[1] - a[1];
                return b[0] - a[0];
            }
        });
        //다이아 -> 철 -> 돌 곡괭이 순서로 계산
        for(int[] a : list) {
            if (picks[0] > 0) {
                answer += a[0];
                picks[0]--;
                continue;
            }
            
            if (picks[1] > 0) {
                answer += a[1];
                picks[1]--;
                continue;
            }
            
            if (picks[2] > 0) {
                answer += a[2];
                picks[2]--;
                continue;
            }
        }
        
        return answer;
    }
}