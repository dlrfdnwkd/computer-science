import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, String[] data) {
        String[] people = {"A", "C", "F", "J", "M", "N", "R", "T"};
        boolean[] included = new boolean[people.length];
        Constraint[] constraints = new Constraint[data.length];

        for (int i = 0; i < data.length; i++) {
            String[] condition = data[i].split("");
            constraints[i] = new Constraint(condition[0], condition[2], condition[3], Integer.parseInt(condition[4]));
        }

        return countPermutations(constraints, people, included, new ArrayList<String>());
    }

    public int countPermutations(Constraint[] constraints, String[] people, boolean[] included, List<String> line) {
        if (line.size() == people.length) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (!included[i]) {
                line.add(people[i]);
                included[i] = true;

                if (isValid(constraints, line)) {
                    count += countPermutations(constraints, people, included, line);
                }

                line.remove(line.size() - 1);
                included[i] = false;
            }
        }

        return count;
    }

    public boolean isValid(Constraint[] constraints, List<String> line) {
        for (Constraint constraint : constraints) {
            int index1 = line.indexOf(constraint.firstPerson);
            int index2 = line.indexOf(constraint.secondPerson);

            if (index1 == -1 || index2 == -1) {
                continue;
            }

            // 간격이 0 - 6까지이므로 인덱스 차이에서 1를 더 빼야한다.
            int gap = Math.abs(index1 - index2) - 1;
            if (!constraint.isSatisfied(gap)) {
                return false;
            }
        }

        return true;
    }

    private static class Constraint {
        String firstPerson;
        String secondPerson;
        String operator;
        int gap;

        public Constraint(String firstPerson, String secondPerson, String operator, int gap) {
            this.firstPerson = firstPerson;
            this.secondPerson = secondPerson;
            this.operator = operator;
            this.gap = gap;
        }

        public boolean isSatisfied(int actualGap) {
            return switch (operator) {
                case "=" -> actualGap == gap;
                case "<" -> actualGap < gap;
                case ">" -> actualGap > gap;
                default -> false;
            };
        }
    }
}