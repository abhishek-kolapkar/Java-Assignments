import java.util.ArrayList;

class Book {
  private final int bookID;
  private String bookTitle;
  private String author;
  private boolean availabilityStatus;

  public Book(int bookID, String bookTitle, String author) {
    this.bookID = bookID;
    this.bookTitle = bookTitle;
    this.author = author;
    this.availabilityStatus = true; // Default to available
  }

  public boolean isAvailable() {
    return availabilityStatus;
  }

  public void borrow() {
    if (availabilityStatus) {
      availabilityStatus = false;
      System.out.println(bookTitle + " has been borrowed.");
    } else {
      System.out.println(bookTitle + " is already borrowed.");
    }
  }

  public void returnBook() {
    availabilityStatus = true;
    System.out.println(bookTitle + " has been returned.");
  }

  public String getDetails() {
    return "Book ID: " + bookID + ", Title: " + bookTitle + ", Author: " + author +
        ", Available: " + availabilityStatus;
  }
}

abstract class User {
  protected String name;
  protected int age;
  protected int userID;

  public User(String name, int age, int userID) {
    this.name = name;
    this.age = age;
    this.userID = userID;
  }

  public abstract void borrowBook(Book book);

  public void returnBook(Book book) {
    book.returnBook();
  }
}

class Patron extends User {
  public Patron(String name, int age, int userID) {
    super(name, age, userID);
  }

  @Override
  public void borrowBook(Book book) {
    if (book.isAvailable()) {
      book.borrow();
    } else {
      System.out.println("Sorry, " + book.getDetails() + " is unavailable.");
    }
  }
}

class Librarian extends User implements ReportGenerator {
  public Librarian(String name, int age, int userID) {
    super(name, age, userID);
  }

  @Override
  public void borrowBook(Book book) {
    if (book.isAvailable()) {
      book.borrow();
    } else {
      System.out.println("Sorry, " + book.getDetails() + " is unavailable.");
    }
  }

  @Override
  public void generateBookReport() {
    System.out.println("Books Report: Display all book details here.");
  }

  @Override
  public void generateUserReport() {
    System.out.println("Users Report: Display all user details here.");
  }
}

interface ReportGenerator {
  void generateBookReport();

  void generateUserReport();
}

public class Library {
  private ArrayList<Book> books = new ArrayList<>();
  private ArrayList<User> users = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
    System.out.println("Added: " + book.getDetails());
  }

  public void addUser(User user) {
    users.add(user);
    System.out.println("Added User: " + user.name);
  }

  public void listBooks() {
    System.out.println("Books in Library:");
    for (Book book : books) {
      System.out.println(book.getDetails());
    }
  }

  public void listUsers() {
    System.out.println("Users in Library:");
    for (User user : users) {
      System.out.println("Name: " + user.name + ", User ID: " + user.userID);
    }
  }

  public static void main(String[] args) {
    Library library = new Library();

    // Add books
    Book book1 = new Book(101, "Java Programming", "James Gosling");
    Book book2 = new Book(102, "Python for Data Science", "Guido van Rossum");
    library.addBook(book1);
    library.addBook(book2);

    // Add users
    Patron patron = new Patron("Alice", 25, 1);
    Librarian librarian = new Librarian("Bob", 40, 2);
    library.addUser(patron);
    library.addUser(librarian);

    // List books and users
    library.listBooks();
    library.listUsers();

    // Borrow and return books
    patron.borrowBook(book1);
    librarian.borrowBook(book2);
    librarian.returnBook(book2);

    // Generate reports
    librarian.generateBookReport();
    librarian.generateUserReport();
  }
}