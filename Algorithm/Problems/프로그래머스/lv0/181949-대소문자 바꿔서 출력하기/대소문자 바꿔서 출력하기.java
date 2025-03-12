import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder answer = new StringBuilder();
        for (char c : a.toCharArray()) {
            answer.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }

        System.out.println(answer.toString());
    }
}