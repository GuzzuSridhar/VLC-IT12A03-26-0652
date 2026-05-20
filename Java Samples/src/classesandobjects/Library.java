package classesandobjects;

public class Library {
    public static void main(String[] args) {
        // create object instances
        Book b001 = new Book();
        Book b002 = new Book();
        Book b003 = new Book();

        // add information of each book instance b001
        b001.title = "Programming in HTML";
        b001.author = "John";
        b001.genre = "Programming";
        b001.publicationYear = 1984;
        b001.numberofPages = 210;

        // add information of each book instance b002
        b002.title = "Programming in CSS";
        b002.author = "Alex";
        b002.genre = "Styling";
        b002.publicationYear = 1999;
        b002.numberofPages = 300;

        // access the information of books
        System.out.println(b001.title +
                " " +
                b001.author +
                " " +
                b001.genre +
                " " +
                b001.publicationYear +
                " " +
                b001.numberofPages

        );
        System.out.println(b002.title +
                " " +
                b002.author +
                " " +
                b002.genre +
                " " +
                b002.publicationYear +
                " " +
                b002.numberofPages

        );

    }
}
