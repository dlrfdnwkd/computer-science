import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String firstInput = scanner.next();
            String secondInput = scanner.next();
            String result = firstInput + secondInput;
            System.out.println(result);
        }
    }
}
