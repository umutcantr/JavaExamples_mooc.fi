/*
 * Student class stores student name, adress and credits.
 */
package inheritanceperson;

/**
 *
 * @author umut
 */
public class Student extends Person {
    private int counter = 0;
    
    
    public Student(String name,String adress){
        super(name,adress);                                                      // uses Person class constructer
    }
    
    public int credits(){ 
        return counter;
    }
    
    public void study(){
        counter++;
    }
    
    @Override                                                                    // override Person class method
    public String toString(){
        return this.name + "\n\t" + this.adress + "\n\t" + "Study credits " 
                + this.counter;
    }
    
}
