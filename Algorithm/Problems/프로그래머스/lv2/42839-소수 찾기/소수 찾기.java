import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        getPermutations(uniqueNumbers, numbers.split(""));
        
        int primeCount = 0;
        for (int number : uniqueNumbers) {
            if (isPrime(number)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    private void getPermutations(Set<Integer> uniqueNumbers, String[] elements) {
        boolean[] visited = new boolean[elements.length];
        String[] currentPermutation = new String[elements.length];
        
        for (int i = 0; i < elements.length; i++) {
            permute(uniqueNumbers, elements, currentPermutation, visited, 0, i + 1);
        }
    }

    private void permute(Set<Integer> uniqueNumbers, String[] elements, String[] currentPermutation, boolean[] visited, int depth, int maxDepth) {
        if (depth == maxDepth) {
            StringBuilder number = new StringBuilder();
            for (int i = 0; i < depth; i++) {
                number.append(currentPermutation[i]);
            }
            uniqueNumbers.add(Integer.valueOf(number.toString()));
            return;
        }
        
        for (int i = 0; i < elements.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                currentPermutation[depth] = elements[i];
                permute(uniqueNumbers, elements, currentPermutation, visited, depth + 1, maxDepth);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2, sqrt = (int) Math.sqrt(number); i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
