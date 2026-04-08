/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Bookinfo{
    String genre();
    String addedBy();
}


enum BookStatus{
    AVAILABLE("BOOK IS AVAILABLE"),
    BORROWED("BOOK IS BORROWED"),
    RESERVED("BOOK IS RESERVED"),
    LOST("BOOK IS LOST");
    
    String display;
    
    BookStatus(String display){
        this.display=display;
    }
    public String getDisplay(){
        return display;
    }
}

class BookBean(){
    private String title;
    private Double price;
    private BookStatus status;
    private int[] borrowCount;

    public BookBean() {
        this.borrowCount=new int[12];
        this.status=BookStatus.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public int[] getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int[] borrowCount) {
        this.borrowCount = borrowCount;
    } 
}



public class Demo {

   
    public static void main(String[] args) {
       BookBean book=new BookBean();
       book.setTitle("dune");
       book.setStatus(BookStatus.BORROWED);
       
    }
    
}
