public class bookManage {
    private String title;
    private String author;
    private boolean isAvailable;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book: " + title + " is currently not available.");
        }
    }
     public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned the book: " + title);
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
    
    public static void main(String[] args) {
        bookManage b1 = new bookManage();
        b1.setTitle("Java");
        b1.setAuthor("xyz");
        b1.setAvailable(true);
        b1.borrowBook();
       b1.printDetails();
        b1.returnBook();
    }
}