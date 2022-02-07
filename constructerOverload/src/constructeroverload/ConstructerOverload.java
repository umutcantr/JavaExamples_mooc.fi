/*
 * This program records products in the hardware store
 * with Product class.
 * 
 */
package constructeroverload;

/**
 *
 * @author umut
 */
public class ConstructerOverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);
        Product tape = tapeMeasure;
        tape = null;                                                          
        

        System.out.println(tape);                                                // null
        System.out.println(plaster);
        System.out.println(tyre);
    }
    
}
