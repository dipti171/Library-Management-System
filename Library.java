import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.borrow();
                System.out.println("You have borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available or already borrowed.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isBorrowed()) {
                book.returnBook();
                System.out.println("You have returned: " + title);
                return;
            }
        }
        System.out.println("This book was not borrowed.");
    }

    public void viewAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void addSampleBooks() {
        addBook("1984", "George Orwell");
        addBook("To Kill a Mockingbird", "Harper Lee");
        addBook("The Great Gatsby", "F. Scott Fitzgerald");
    }
}
