/*
 * Person class stores name and adress info.
 */
package inheritanceperson;

/**
 *
 * @author umut
 */
public class Person {
    protected String name;
    protected String adress;
    
    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }
    
    public String toString(){
        return this.name + "\n\t" + this.adress;
    }
    
}
