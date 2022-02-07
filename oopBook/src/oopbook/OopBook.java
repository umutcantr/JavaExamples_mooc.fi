/*
 * This program shows book name and author name with number of pages.
 */
package oopbook;

/**
 *
 * @author umut
 */
public class OopBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book book = new Book("Umutcan Genç", "Yeraltından sesler", 250);
        System.out.println(book);
        System.out.println(book.getAuthor());
    }
    
}
