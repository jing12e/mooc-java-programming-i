
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longest = 0;
        int count = 0;
        int sum = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            String name = pieces[0];
            int length = name.length();

            sum = sum + Integer.valueOf(pieces[1]);
            count++;
            if (length > longest) {
                longestName = pieces[0];
                longest = length;

            }

        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);

    }
}
