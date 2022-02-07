/*
 * This program stores teacher and student informations.
 * Teacher and Student class extends Person class.
 */
package inheritanceperson;

/**
 *
 * @author umut
 */
import java.util.ArrayList;
public class InheritancePerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        ArrayList<Person> persons = new ArrayList<Person>();
        
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);
}
     public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    
}
