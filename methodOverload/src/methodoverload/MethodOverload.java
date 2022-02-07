/*
 * This program creates a counter. İncreases and decreases counter.
 */
package methodoverload;

/**
 *
 * @author umut
 */
public class MethodOverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Counter counter=new Counter(15);
        counter.decrease();
        counter.decrease(4);
        System.out.println(counter.value());
        
        counter.increase();
        counter.increase(9);
        System.out.println(counter.toString());
        
        counter.increase(-9);
        System.out.println(counter.toString());
    }
    
}
