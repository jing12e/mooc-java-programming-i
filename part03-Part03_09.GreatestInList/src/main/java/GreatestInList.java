
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // implement finding the greatest number in the list here
        int greatestNumber = list.get(0);
        int i = 0;
        while (i < list.size()) {
            int number = list.get(i);

            if (number > greatestNumber) {
                greatestNumber = number;
            }
            i++;

        }

        System.out.println("The greatest number: " + greatestNumber);

    }
}
