package example.com;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // Create some Book objects
        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain", "978-1234567890");
        Book book2 = new Book("Ben Hur", "Lewis Wallace", "978-0987654321");
        Book book3 = new Book("Time Machine", "H.G. Wells", "978-1122334455");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy", "978-6677889900");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Display books
        library.displayBooks();

        // Remove a book by ISBN
        library.removeBookByISBN("978-1122334455"); // Remove "Time Machine"

        // Display books after removal
        library.displayBooks();
    }
}
