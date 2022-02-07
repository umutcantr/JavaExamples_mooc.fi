/*
 * Multiplier class multiply initalized object number with 
 * supplied parameter in multiply function.
 */
package oopmultiplier;

/**
 *
 * @author umut
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int number){
        this.number = number;
    }
    
    public int multiply(int number){
        return this.number * number;
    }
}
