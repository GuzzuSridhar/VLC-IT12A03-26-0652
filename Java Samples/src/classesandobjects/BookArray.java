package classesandobjects;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        // add books to array
        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();

        // populate book info for books[0]
        books[0].title = "Programming python";
        books[0].author = "John";
        books[0].publicationYear = 1999;
        books[0].genre = "Coding";
        books[0].numberofPages = 200;

        // populate book info for books[1]
        books[1].title = "Programming C";
        books[1].author = "Alex";
        books[1].publicationYear = 1984;
        books[1].genre = "Programming";
        books[1].numberofPages = 545;

        // populate book info for books[2]
        books[2].title = "Programming HTML";
        books[2].author = "Bill";
        books[2].publicationYear = 1994;
        books[2].genre = "Programming";
        books[2].numberofPages = 677;

        // access the all book details and print
        System.out.println("There are " + books.length + " books in our library");
        for (Book book : books) {
            System.out.println(
                    book.title +
                            " " +
                            book.author +
                            " " +
                            book.genre +
                            " " +
                            book.publicationYear +
                            " " +
                            book.numberofPages);

        }

    }
}
