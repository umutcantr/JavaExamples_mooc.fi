/*
 * Cube class creates a cube object and prints volume.
 */
package oopcube;

/**
 *
 * @author umut
 */
public class Cube {
    private int edgeLength;
   
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    public int volume(){
        int volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return volume;
    }
    public String toString(){
        return  "The length of the edge is " + edgeLength + "and the volume " 
                + volume();
    }
    
}