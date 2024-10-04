import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int columns = scanner.nextInt();
            int rows = scanner.nextInt();
            
            StringBuilder builder = new StringBuilder(columns);
            for (int i = 0; i < columns; i++) {
                builder.append('*');
            }

            String rowPattern = builder.toString();
            for (int i = 0; i < rows; i++) {
                System.out.println(rowPattern);
            }
        }
    }
}
