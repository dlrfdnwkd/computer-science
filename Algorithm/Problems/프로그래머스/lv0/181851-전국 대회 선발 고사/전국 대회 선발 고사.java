import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        class Student {
            int rank = -1;
            int index = -1;

            Student(int rank, int index) {
                this.rank = rank;
                this.index = index;
            }

        }

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(new Student(rank[i], i));
            }
        }

        list.sort((a, b) -> a.rank - b.rank);
        int answer = list.get(0).index * 10000 + list.get(1).index * 100 + list.get(2).index;

        return answer;
    }
}