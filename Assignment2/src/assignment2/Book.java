package assignment2;
import java.util.Arrays;
import java.util.Objects;

/**
 * Simple class for task 4 of assignment 2
 * Creating a Book class
 * @author maria ramlochan
 */
public class Book {
    
    //Data members
    private String title;
    private String[] authors;
    private double price;
    
    /**
     * Default constructor 
     */
    public Book() {
        this.title = "";
        this.authors = new String[]{};
        this.price = 0;
    }
     
    /**
     * Constructor with all data members
     * @param title the title of the book
     * @param authors the array of authors of the book
     * @param price the price of the book
     */
    public Book(String title, String[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }
    
    /**
     * Copy construction
     * @param book the book from Book class
     */
    public Book(Book book) {
        this.title = book.title;
        this.authors = book.authors;
        this.price = book.price;
    }
    
    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Arrays.deepEquals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        return String.format("\nTitle: %s\nAuthors: %s\nPrice: %s", 
                title, Arrays.toString(authors), price);
    }
    
    //Getters
    public String getTitle() {
        return title;
    }
    public String[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    
    //Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

}