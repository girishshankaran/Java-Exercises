package testing.org;


import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book\n2. Borrow Book\n3. Return Book\n4. Display Books\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author name: ");
                String author = scanner.nextLine();
                books.add(new Book(title, author));
                System.out.println("Book added!");
            } else if (choice == 2) {
                System.out.print("Enter book title to borrow: ");
                String title = scanner.nextLine();
                boolean found = false;
                for (Book book : books) {
                    if (book.getTitle().equalsIgnoreCase(title)) {
                        book.borrowBook();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book not found!");
                }
            } else if (choice == 3) {
                System.out.print("Enter book title to return: ");
                String title = scanner.nextLine();
                boolean found = false;
                for (Book book : books) {
                    if (book.getTitle().equalsIgnoreCase(title)) {
                        book.returnBook();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book not found!");
                }
            } else if (choice == 4) {
                if (books.isEmpty()) {
                    System.out.println("No books in library!");
                } else {
                    System.out.println("Library Books:");
                    for (Book book : books) {
                        System.out.println(book.getTitle() + " by " + book.getAuthor() + 
                            (book.isBorrowed() ? " (Borrowed)" : " (Available)"));
                    }
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
}