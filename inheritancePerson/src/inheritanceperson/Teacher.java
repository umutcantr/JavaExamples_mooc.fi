/*
 * Teacher class stores teacher name, adress and salary info.
 */
package inheritanceperson;

/**
 *
 * @author umut
 */
public class Teacher extends Person{
    private int salary;
   
    public Teacher(String name, String adress, int salary){
        super(name,adress);                                                      // uses Person class constructer
        this.salary = salary;
    }
    
    @Override                      
    public String toString(){                                                    // override Person class method
        return this.name + "\n\t" + this.adress + "\n\t" + "salary " 
                + salary + " euro/month";
    }
    
}
