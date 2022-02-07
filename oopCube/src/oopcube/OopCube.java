/*
 * This program creates a cube and prints its volume.
 */
package oopcube;

/**
 *
 * @author umut
 */
public class OopCube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Cube oSheaJackson = new Cube(4);
    System.out.println(oSheaJackson.volume());
    System.out.println(oSheaJackson);

    Cube salt = new Cube(2);
    System.out.println(salt.volume());
    System.out.println(salt);
    
    } 
}
