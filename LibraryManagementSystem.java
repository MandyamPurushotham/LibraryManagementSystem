
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        //Sample Data
        library.addBook("Pride and Prejudice", "Jane Austen");
        library.addBook("Animal Farm", "George Orwell");
        library.addBook("Alice in Wonderland", "Lewis Carroll");
        library.addBook("The Great Gatsby", " F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        library.registerUser("Purushotham", 12345);
        library.registerUser("Mahesh", 12346);
        library.registerUser("Dhoni", 12347);
        library.registerUser("Thanish", 12348);
        library.registerUser("Mallesh", 12349);

        while (true) {
            System.out.println("\n--- Library Menu ---\n1. Show all books\n2. Borrow a book \n3. Return a book\n4. Search book  \n5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 ->
                    library.showAllBooks();
                case 2 -> {
                    System.out.println("Enter book title");
                    String borrowTitle = scanner.nextLine();
                    System.out.println("Enter user id");
                    int userId = scanner.nextInt();
                    library.borrowBook(borrowTitle, userId);
                }
                case 3 -> {
                    System.out.println("Enter book title");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                }
                case 4 -> {
                    System.out.println("Search by book name or authour");
                    String serchBook = scanner.nextLine();
                    library.searchBook(serchBook);
                    break;
                }
                case 5 ->
                    System.out.println("Existing.....");

                default ->
                    System.out.println("Invalid choise");
            }

        }

    }

}
