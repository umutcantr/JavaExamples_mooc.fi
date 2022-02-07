/*
 * Book class creates book object and return author name, name of book and
 * number of pages with getAuthor, getName and getPages funtions, respectively.
 */
package oopbook;

/**
 *
 * @author umut
 */
public class Book {
    private String author;
    private String nameOfBook;
    private int pageOfBook;
    
    
    public Book(String author, String name, int pages){
        this.author=author;
        this.nameOfBook=name;
        this.pageOfBook=pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.nameOfBook;
    }
    
    public int getPages(){
        return this.pageOfBook;
    } 
    
    public String toString(){
        return this.author + ", " + this.nameOfBook + ", " 
                + this.pageOfBook + " pages";
    }
}
