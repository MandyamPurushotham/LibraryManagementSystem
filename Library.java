
import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> booksList = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();

    public void addBook(String title, String author) {
        booksList.add(new Book(title, author));
    }

    public void registerUser(String name, int userId) {
        users.add(new User(name, userId));
    }

    public void showAllBooks() {
        for (Book book : booksList) {
            System.out.println(book);
        }
    }

    public void borrowBook(String title, int userId) {
        boolean userExists = false;
        for (User user : users) {
            if (user.getUserId() == userId) {

                System.out.println(title + "book is borrowed by " + userId);
                //userExists = true;
                break;
            }
            if (!userExists) {
                System.out.println("User with ID " + userId + " is not registered.");
                return;
            }
            for (Book book : booksList) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            if (book.isBorrowed()) {
                System.out.println("Book is already borrowed.");
            } else {
                book.borrow(); // mark the book as borrowed
                System.out.println("Book \"" + title + "\" is borrowed by user ID " + userId + ".");
            }
            return;
        }
    }
            System.out.println("Book is not found");
        }
    }

    public void returnBook(String title) {
        for (Book book : booksList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Book returned Successfully");
                } else {
                    System.out.println("Book not borrowed.");
                }
                return;
            }

        }
        System.out.println("Book is not found");
    }

    public void searchBook(String keyword) {
        for (Book book : booksList) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

}
