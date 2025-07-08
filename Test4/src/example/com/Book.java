package example.com;

import java.util.ArrayList;
import java.util.List;

// Book class with attributes and constructors
class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (ISBN: " + ISBN + ")";
    }
}





