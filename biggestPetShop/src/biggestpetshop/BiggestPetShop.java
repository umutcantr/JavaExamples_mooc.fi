/*
 * This program creates pet and person objects from
 * Person and Pet class files.
 * 
 * 
 */
package biggestpetshop;

/**
 *
 * @author umut
 */
import java.util.Scanner;
public class BiggestPetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       Pet lucy = new Pet("Lucy", "golden retriever");
       Person leo = new Person("Leo", lucy);

       System.out.println(leo);
       System.out.println(lucy);                                                 // doesnt properly work because Pet class not has toString method.
    }
    
}
