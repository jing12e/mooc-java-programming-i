
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String name = scanner.nextLine();
        try (Scanner scanner1 = new Scanner(Paths.get(name))) {
            while (scanner1.hasNextLine()) {
                // we read one line
                String row = scanner1.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

    }
}
