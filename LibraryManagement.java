import java.util.Scanner;

public class LibraryManagement {

    int BookId, avlBook, TotalBook;
    String BookName = "", BookAuthor = "", BookCategory = "";
    Scanner sc = new Scanner(System.in);

    void mainMenu() {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add Book");
        System.out.println("2. View Book");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Delete Book");
        System.out.println("7. Library Report");
        System.out.println("8. Exit");
    }

    public void addBook() {
        System.out.println("Add your book");
        System.out.println("Enter book ID: ");
        BookId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter book Name: ");
        BookName = sc.nextLine();

        System.out.println("Enter book Author: ");
        BookAuthor = sc.nextLine();

        System.out.println("Enter book Category: ");
        BookCategory = sc.nextLine();

        System.out.println("Enter Total Books:");
        TotalBook = sc.nextInt();
        avlBook = TotalBook;
        System.out.println("Book Added");
    }

    public void view() {
        System.out.println("Book Details");
        System.out.println("Book ID: " + BookId);
        System.out.println("Book Name: " + BookName);
        System.out.println("Book Author: " + BookAuthor);
        System.out.println("Book Category: " + BookCategory);
        System.out.println("Total Books: " + TotalBook);
        System.out.println("Available Books: " + avlBook);
        System.out.println("Issued Books: " + (TotalBook - avlBook));
    }

    void SearchBook() {
        System.out.println("Enter book id to search: ");
        int s = sc.nextInt();

        if (s == BookId) {
            System.out.println("Book Found");
            view();
        } else {
            System.out.println("Book not found!");
        }
    }

    void issueBook() {
        if (avlBook > 0) {
            avlBook -= 1;
            System.out.println("Book Issued");
        } else {
            System.out.println("Book cannot be issued");
        }
    }

    void returnBook() {
        if (avlBook < TotalBook) {
            avlBook += 1;
            System.out.println("Book Returned");
        } else {
            System.out.println("Book cannot be returned");
        }
    }

    void deleteBook() {
        if (BookId != 0) {
            BookId = 0;
            BookAuthor = "";
            BookCategory = "";
            BookName = "";
            avlBook = 0;
            TotalBook = 0;
            System.out.println("Book deleted");
        } else {
            System.out.println("Book not added");
        }
    }

    void libraryReport() {
        System.out.println("--- Library Report ---");
        view();
    }

    public static void main(String[] args) {
        LibraryManagement obj = new LibraryManagement();
        int choice;

        do {
            obj.mainMenu();
            System.out.print("Enter a number between 1 and 8: ");
            choice = obj.sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addBook();
                    break;
                case 2:
                    obj.view();
                    break;
                case 3:
                    obj.SearchBook();
                    break;
                case 4:
                    obj.issueBook();
                    break;
                case 5:
                    obj.returnBook();
                    break;
                case 6:
                    obj.deleteBook();
                    break;
                case 7:
                    obj.libraryReport();
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 8.");
            }
        } while (choice != 8);
    }
}