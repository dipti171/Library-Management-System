import java.util.Scanner;

public class UserInterface {
    private Library library;
    private Scanner scanner;

    public UserInterface() {
        library = new Library();
        library.addSampleBooks(); // Adding sample books
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Available Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter book title to borrow: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                case 4:
                    library.viewAvailableBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
