
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here////////////////////
        System.out.print("Give a word: ");
        String cake = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(cake);
        }

    }
}
