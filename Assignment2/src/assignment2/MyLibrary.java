package assignment2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Simple class for task 4 of assignment 2
 * Creating a MyLibery class
 * @author maria ramlochan
 */
public class MyLibrary {
    
    //Data members
    private Book[] books;
    
    /**
     * Default constructor 
     * @param n any number of string author
     */
    public MyLibrary(int n) {
        this.books = new Book[n];
    }
    
    /**
     * Constructor with all data members
     * @param books the book array from Book class
     */
    public MyLibrary(Book[] books) {
        this.books = books;
    }
    
    /**
     * Copy construction
     * @param myLibrary a my library containing the books
     */
    public MyLibrary(MyLibrary myLibrary) {
        this.books = myLibrary.books;
    }
    
    /**
     * Method to select a random book
     * @return a random book
     */
    public Book selectBook(){
       Random random = new Random();
       int r = random.nextInt(books.length);
       return books[r];
    }
    
    /**
     * Method to select a random book with a random index
     * @param idx the index of the book in an array
     * @return the index of the book or a random one if not valid
     */
    public Book selectBook(int idx) {
        if (idx != books.length)
            return selectBook();
        return books[idx];
    }
    
    /**
     * Method to calculate the total price in an array of books
     * @return the sum of all book prices
     */
    public double calcTotalPrice() {
        double sum = 0;
        for(Book book : books)
            sum += book.getPrice();
        return sum;
    }
    
    /**
     * Method to count the number of authors who have nationality
     * @param nationality the nationality of the authors
     * @return the number of authors with a given nationality
     */
    public int countAuthorWithNationality(String nationality) {
        ArrayList<Author> countedAuthors = new ArrayList<>();
        
        for (Book book : books)
            for (Author author : book.getAuthors())
                if (author.getNationality().equalsIgnoreCase(nationality) 
                        && !countedAuthors.add(author))

        return countedAuthors.size();
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
        final MyLibrary other = (MyLibrary) obj;
        if (!Arrays.deepEquals(this.books, other.books)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        return String.format("\nMy Libery: %s", Arrays.toString(books));
    }
    
    //Getters
    public Book[] getBooks() {
        return books;
    }
    //Setters
    public void setBooks(Book[] books) {
        this.books = books;
    }
    
}