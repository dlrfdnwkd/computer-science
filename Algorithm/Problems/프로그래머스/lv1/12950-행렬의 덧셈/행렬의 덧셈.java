class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int row = 0;row < answer.length;row++){
            for(int column = 0;column < answer[row].length;column++)
                answer[row][column] = arr1[row][column] + arr2[row][column];
        }
        
        return answer;
    }
}