/*
 * This program multiply values with Multiplier class.
 */
package oopmultiplier;

/**
 *
 * @author umut
 */
public class OopMultiplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Multiplier Three= new Multiplier(3);
        System.out.println("Three.multiply(2): " + Three.multiply(2));

        Multiplier Four = new Multiplier(4);
        System.out.println("Four.multiply(2): " + Four.multiply(2));
        System.out.println("Three.multiply(1): " + Three.multiply(1));
        System.out.println("Four.multiply(1): " + Four.multiply(1));
    }
    
}
