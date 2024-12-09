/**
 * @Mihir Patel
 */

public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
        title = "";
        author = "";
        price = 0;
        publisher = "";
        isbn = "";
    }
    public Book(String title) {
        this.title = title;
    }
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    public Book(Book anotherBook) {
        title = anotherBook.title;
        author = anotherBook.author;
        price = anotherBook.price;
        publisher = anotherBook.publisher;
        isbn = anotherBook.isbn;
    }
    public void checkIsbnStatus() {
        int isbn10Length = 10;
        int isbn13Length = 13;
        String first3Digits = "978";

        if (isbn.length() == isbn10Length) {
            int validity = 0;
        }
        else if (isbn.length() == isbn13Length) {
            int validity = 1;
        }
        else {
            int validity = -1;
        }
    }
    public String toTitleCase(String title, String author) {

    }
    public boolean equals(Book anotherBook) {
        return title.equals(anotherBook.title) &&
                author.equals(anotherBook.author) &&
                price == anotherBook.price &&
                publisher.equals(anotherBook.publisher);
    }
    public void clone(Book anotherBook) {
        this.title = anotherBook.title;
        this.author = anotherBook.author;
    }

}
