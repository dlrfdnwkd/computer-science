/*
 * DP문제
 * 3칸일 경우
 * 1) 1칸에서 2칸을 뛸 경우
 * 2) 2칸에서 1칸을 뛸 경우
 * 3) 1칸에서 1칸을 뛸 경우(이미 2칸에 더해짐)
 * 즉, 그 전 칸에서 올 경우 + 그 전전 칸에서 올 경우
 */
class Solution {
    public long solution(int n) {
        long[] array = new long[n];
        
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        array[0] = 1;
        array[1] = 2;
        
        for(int i = 2;i < n;i++){
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }
        
        return array[n - 1];
    }
}