
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        // Write your program here
    }
}
