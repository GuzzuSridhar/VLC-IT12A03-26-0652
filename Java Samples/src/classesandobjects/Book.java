package classesandobjects;

public class Book {
    // class can have fields and methods
    // it is a blueprint

    // Instance Variables
    String title;
    String author;
    int publicationYear;
    String genre;
    int numberofPages;

    // constructors
    // Default Constructor
    public Book() {
    }
    // custom constructor

    // fully loaded constructor
    public Book(String title, String author, int publicationYear, String genre, int numberofPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.numberofPages = numberofPages;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

}
