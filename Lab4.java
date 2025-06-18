public class Main {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("J.K. Rowling", "jk.rowling@example.com", "British");

        // Create a Book object using the Author object
        Book book = new Book("Harry Potter and the Philosopher's Stone", 19.99, author);

        // Print the details of the Book (which includes Author details)
        System.out.println(book.toString());
    }
}
