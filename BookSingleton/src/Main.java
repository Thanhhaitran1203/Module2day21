public class Main {
    public static void main(String[] args) {
        System.out.println("Begin testing singleton pattern");
        BookBorrower bookBorrower = new BookBorrower();
        BookBorrower bookBorrower1 = new BookBorrower();
        bookBorrower.borrowBook();
        System.out.println("BookBorrowe asked to borrow the book");
        System.out.println("BookBorrowe Author and Title:");
        System.out.println(bookBorrower.getAuthorAndTitle());

        bookBorrower1.borrowBook();
        System.out.println("BookBorrowe1 asked to borrow the book");
        System.out.println("BookBorrowe1 Author and Title:");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower.returnBook();
        System.out.println("Bookborrower returned the book");

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 Author and Title:");
        System.out.println(bookBorrower.getAuthorAndTitle());

        System.out.println("End testing singleton pattern");
    }
}