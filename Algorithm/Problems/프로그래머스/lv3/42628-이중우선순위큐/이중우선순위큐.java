import java.util.TreeSet;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (String operation : operations) {
            String[] operationAndData = operation.split(" ");
            if (operationAndData[0].equals("I")) {
                set.add(Integer.parseInt(operationAndData[1]));
            } else {
                if (!set.isEmpty()) {
                    if (operationAndData[1].equals("1")) {
                        set. pollLast();
                    } else {
                        set.pollFirst();
                    }
                }
            }
        }

        if (set.size() != 0) {
            answer[0] = set.last();
            answer[1] = set.first();
        }

        return answer;
    }
}