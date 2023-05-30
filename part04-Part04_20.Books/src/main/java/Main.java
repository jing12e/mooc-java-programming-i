import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            String pages = scanner.nextLine();
            System.out.print("Publication year: ");
            String year = scanner.nextLine();

            books.add(new Book(title, pages, year));

        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String print = scanner.nextLine();

        if (print.equals("everything")) {
            for (Book i : books) {
                System.out.println(i);
            }
        } else {
            for (Book i : books) {
                System.out.println(i.getTitle());
            }

        }

    }
}
