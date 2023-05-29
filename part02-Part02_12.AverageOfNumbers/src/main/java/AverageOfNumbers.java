
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            sum = sum + number;
            numbers = numbers + 1;
        }
        double average = 1.0 * sum / numbers;
        System.out.println("Average of the numbers: " + average);

    }
}
