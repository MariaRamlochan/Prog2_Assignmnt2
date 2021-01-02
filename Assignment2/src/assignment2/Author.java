package assignment2;
import java.util.Objects;

/**
 * Simple class for task 4 of assignment 2
 * Creating a Author class
 * @author maria ramlochan
 */
public class Author {
    
    //Data members
    private String name;
    private String nationality;
    private String email;
    
    /**
     * Default constructor 
     */
    public Author() {
        this.name = "";
        this.nationality = "";
        this.email = "";
    }
    
    /**
     * Constructor with all data members
     * @param name the name of the author
     * @param nationality the nationality of the author
     * @param email the email of the author
     */
    public Author(String name, String nationality, String email) {
        this.name = name;
        this.nationality = nationality;
        this.email = email;
    }
    
    /**
     * Copy constructor 
     * @param author the author
     */
    public Author(Author author) {
        this.name = author.name;
        this.nationality = author.nationality;
        this.email = author.email;
    }
    
    /**
     * Method to verify if nationality valid
     * @param nationality the nationality of the author
     * @return the nationality if it is valid
     */
    public boolean isNationalityValid(String nationality) {
        return nationality.equals("Canadian") || nationality.equals("American") ||
                nationality.equals("French") || nationality.equals("British") ||
                nationality.equals("German");
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
        final Author other = (Author) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nationality, other.nationality)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        return String.format("\nName: %s\nNationality: %s\nEmail: %s", 
                name, nationality, email);
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public String getEmail() {
        return email;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setNationality(String nationality) {
        if(isNationalityValid(nationality));
        this.nationality = nationality;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}