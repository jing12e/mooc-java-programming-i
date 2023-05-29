
import java.util.Scanner;

import org.w3c.dom.Text;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            String[] parts = text.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }

        }

    }
}
