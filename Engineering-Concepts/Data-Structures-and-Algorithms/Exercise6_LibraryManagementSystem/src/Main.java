public class Main {

    public static void main(String[] args) {

        // Books sorted alphabetically by title
        Book[] books = {
                new Book(103, "Algorithms", "Thomas Cormen"),
                new Book(105, "Computer Networks", "Andrew Tanenbaum"),
                new Book(102, "Data Structures", "Robert Lafore"),
                new Book(101, "Java Basics", "James Gosling"),
                new Book(104, "Operating Systems", "Abraham Silberschatz")
        };

        LibrarySearch librarySearch = new LibrarySearch();

        String searchTitle = "Algorithms";

        System.out.println("===== Linear Search =====");

        Book linearResult = librarySearch.linearSearch(books, searchTitle);

        if (linearResult != null) {
            System.out.println("Book Found!");
            System.out.println(linearResult);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println();

        System.out.println("===== Binary Search =====");

        Book binaryResult = librarySearch.binarySearch(books, searchTitle);

        if (binaryResult != null) {
            System.out.println("Book Found!");
            System.out.println(binaryResult);
        } else {
            System.out.println("Book not found.");
        }
    }
}