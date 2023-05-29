import javax.print.attribute.standard.Media;

public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account firstaccount = new Account("me", 100.0);
        firstaccount.deposit(20.0);
        System.out.println(firstaccount);

    }
}
