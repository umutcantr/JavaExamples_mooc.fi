/*
 *
 */
package constructeroverload;

/**
 *
 * @author umut
 */
public class Product {
    private String name;
    private String location;
    private double weight;
    
    public Product(String name, String location, int weight) {                   // constructer with name location and weight parameter.
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    
    public Product(String name) {                                                // constructer with only name parameter.
        this(name, "shelf", 1);
    }

    public Product(String name, String location) {                               // constructer with name and location parameter.
        this(name, location, 1);
    }
    
    
    public Product(String name, int weight) {                                    // constructer with name and weight parameter.
        this(name, "shelf", weight);
    }
    
    public String toString(){
        return this.name+"("+this.weight+") can be found from the "+this.location;
    }
    
}
