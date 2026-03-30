import java.util.*;

// Book class
class Book {
    int id;
    String title;
    String author;

    // Constructor
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

// Main class
public class LibraryManagement {
    static ArrayList<Book> library = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    // Add book
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        library.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    // Display books
    static void displayBooks() {
        if (library.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (Book b : library) {
            b.display();
        }
    }

    // Search book
    static void searchBook() {
        System.out.print("Enter title to search: ");
        String title = sc.nextLine();

        boolean found = false;

        for (Book b : library) {
            if (b.title.equalsIgnoreCase(title)) {
                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Remove book
    static void removeBook() {
        System.out.print("Enter title to remove: ");
        String title = sc.nextLine();

        Iterator<Book> it = library.iterator();
        boolean removed = false;

        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equalsIgnoreCase(title)) {
                it.remove();
                removed = true;
                System.out.println("Book removed successfully!");
            }
        }

        if (!removed) {
            System.out.println("Book not found.");
        }
    }
}
