/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asgn;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.*;

// ==================== STEP 1: Custom Annotation ====================
@Retention(RetentionPolicy.RUNTIME)
@interface BookInfo {
    String genre();
    String addedBy();
}

// ==================== STEP 2: Enum BookStatus ====================
enum BookStatus {
    AVAILABLE("The book is available on the shelf"),
    BORROWED("The book has been borrowed by a member"),
    RESERVED("The book is reserved for someone"),
    LOST("The book is reported lost");

    private String message;

    BookStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// ==================== STEP 3: JavaBean BookBean ====================
@BookInfo(genre = "Science Fiction", addedBy = "Admin")
class BookBean implements java.io.Serializable {
    // Private fields
    private String title;
    private Double price;          // Wrapper class
    private BookStatus status;     // Enum
    private int[] borrowCount;     // Indexed property (12 months)

    // No-arg constructor (required for JavaBean)
    public BookBean() {
        this.borrowCount = new int[12];
        this.status = BookStatus.AVAILABLE;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for price (Wrapper class Double)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Getter and Setter for status (Enum)
    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    // Array Getter and Setter for borrowCount
    public int[] getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int[] borrowCount) {
        this.borrowCount = borrowCount;
    }

    // Indexed Getter for borrowCount
    public int getBorrowCount(int month) {
        return borrowCount[month];
    }

    // Indexed Setter for borrowCount
    public void setBorrowCount(int month, int count) {
        this.borrowCount[month] = count;
    }
}

// ==================== STEP 4: Main Program ====================
public class Asgn {
    public static void main(String[] args) {

        // Create BookBean object and set fields
        BookBean book = new BookBean();
        book.setTitle("Dune");
        book.setPrice(499.99);    // Auto-boxing: double -> Double

        // Print initial details
        System.out.println(" Book Details ");
        System.out.println("Title  : " + book.getTitle());
        System.out.println("Price  : Rs." + book.getPrice());
        System.out.println("Status : " + book.getStatus() + " - " + book.getStatus().getMessage());

        // Change status to BORROWED and print message
        System.out.println("\n Changing Status to BORROWED ");
        book.setStatus(BookStatus.BORROWED);
        System.out.println("Status : " + book.getStatus() + " - " + book.getStatus().getMessage());

        // Set borrow count for months 1-3 using indexed setter
        System.out.println("\n Setting Borrow Count (Month 1-3) ");
        book.setBorrowCount(0, 5);   // Month 1
        book.setBorrowCount(1, 8);   // Month 2
        book.setBorrowCount(2, 3);   // Month 3

        System.out.println("Month 1 borrows: " + book.getBorrowCount(0));
        System.out.println("Month 2 borrows: " + book.getBorrowCount(1));
        System.out.println("Month 3 borrows: " + book.getBorrowCount(2));

       // Use Reflection to read @BookInfo annotation
        System.out.println("\n Reading Annotation using Reflection ");
        
        BookInfo anno = book.getClass().getAnnotation(BookInfo.class);
        System.out.println("Genre    : " + anno.genre());
        System.out.println("Added By : " + anno.addedBy());
  }
}




//Design a mini Library Management System in Java using JavaBeans, Enums, and Annotations together.
//
//### Requirements
//
//**Step 1: Create an Annotation @BookInfo**
//Define a custom annotation with:
//* genre (String)
//* addedBy (String)
//* Use @Retention (RUNTIME) so it can be read at runtime.
//
//**Step 2: Create an Enum BookStatus**
//* With values: AVAILABLE, BORROWED, RESERVED, LOST
//* Each value must hold a display message via a constructor.
//
//**Step 3: Create a JavaBean BookBean**
//* Fields:
//    * title (String)
//    * price (Double) - use Wrapper class
//    * status (BookStatus) - use your enum
//    * borrowCount (int array, indexed - track borrows per month for 12 months)
//
//**Step 4: Main Program**
//* Annotate the BookBean class with @BookInfo(genre="Science Fiction", addedBy="Admin").
//* Create a BookBean object and set its fields.
//* Change its status to BORROWED and print the status message.
//* Set borrow count for months 1-3 using an indexed setter.
//* Use Reflection to read and print the @BookInfo annotation values.