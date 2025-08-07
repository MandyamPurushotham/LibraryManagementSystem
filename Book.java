
public class Book {

    private String title;
    private String authour;
    private boolean isBorrowed;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public Book(String title, String authour) {
        this.title = title;
        this.authour = authour;
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return title + " - by " + authour + " is " + (isBorrowed ? "\t [Borrowed]  " : "\t [Available] ");
    }

}
