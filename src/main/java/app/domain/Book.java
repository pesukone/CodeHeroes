package app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.DiscriminatorValue;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * This class is to create different book objects.
 */
@Entity
@DiscriminatorValue(value = "Book")
public class Book extends Reference {

   
    /**
     * There are two possibilities of storing authors: String and
     * ArrayList<String>. It depends on the implementation, which of those will
     * remain.
     */
//    private List<String> authors;
    
    
    @NotEmpty(message = "Field can not be empty!")
    private String publisher;
    private String address;

    /**
     * This constructor contains all the possible data fields of a book.
     *
     * @param address is not compulsory.
     */
//    public Book(String author, ArrayList<String> authors, String title, int year, String publisher) {
//        
////      this.authors = authors;
//        this.author = author;
//        this.title = title;
//        this.year = year;
//        this.publisher = publisher;
//        this.address = "";
//    }
    
  
    /**
     * The method returns the author at the position n on the list.
     */
//    public String getAuthor(int n) {
//        return this.authors.get(n);
//    }
    /**
     * The method returns the authors, if they are saved as a String.
     */
//    @Override
//    public String getAuthor() {
//        return this.author;
//    }

   

    // @Override
    public String getPublisher() {
        return this.publisher;
    }

    public String getAddress() {
        return this.address;
    }

   

    /**
     * The method inserts an author at the place n on the list. The possible
     * previous author at the place n is shifted to the rigth. 
     */
//    public void setAuthor(String author, int n) {
//        this.authors.add(n, title);
//    }
    /**
     * The method sets the authors, if the authors are saved as a String..
     */
//    @Override
//    public void setAuthor(String author) {
//        this.author = author;
//    }

   

    @Override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method returns all the information of the book referenced.
     * The if-sentence allows the address field to be empty.
     *
     * @return The reference information of a book as a String.
     */
    @Override
    public String toString() {
        String tulostus = super.getAuthors() + ". " + super.getTitle() + ". " + this.publisher + ", " + super.getYear() + ".";
        if (!this.address.isEmpty()) {
            tulostus = tulostus + " " + this.address + ".";
        }
        return tulostus;
    }

    /**
     * This method returns all the information of the book referenced as a
     * BibTex String.
     *
     * @return The BibTex-reference information of a book as a String.
     */
    @Override
    public String toBibTex() {
        return "Not supported yet";
    }

  
}
