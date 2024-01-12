import java.util.Scanner;

public class Book1 {
    private int bookCode;
    private String title;
    private double price;

    // Parameterized constructor
    public Book1(int bookCode, String title, double price) {
        this.bookCode = bookCode;
        this.title = title;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Code: " + bookCode);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user for a book
        System.out.print("Enter Book Code: ");
        int userBookCode = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Title: ");
        String userTitle = scanner.nextLine();
        System.out.print("Enter Price: $");
        double userPrice = scanner.nextDouble();

        // Creating Book1 object using the parameterized constructor
        Book1 userBook = new Book1(userBookCode, userTitle, userPrice);

        // Displaying details of the user book
        System.out.println("\nDetails of User Book:");
        userBook.displayDetails();

        scanner.close();
    }
}
