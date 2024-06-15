class Solution {

    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        int[] line = new int[n];
        boolean[] used = new boolean[n];
        int index = 0;
        
        // Initialize line array with values 1 to n
        for (int i = 0; i < line.length; i++) {
            line[i] = i + 1;
        }
        
        // Calculate the k-th permutation
        while (index < answer.length - 1) {
            long number = (k - 1) / factorial(--n);
            int count = 0;
            for (int i = 0; i < line.length; i++) {
                if (!used[i]) {
                    if (count == number) {
                        used[i] = true;
                        answer[index] = line[i];
                        index++;
                        k -= number * factorial(n);
                        break;
                    }
                    count++;
                }
            }
        }
        
        // Add the last remaining element
        for (int i = 0; i < used.length; i++) {
            if (!used[i]) {
                answer[index] = line[i];
                break;
            }
        }
       
        return answer;
    }
    
    private long factorial(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}