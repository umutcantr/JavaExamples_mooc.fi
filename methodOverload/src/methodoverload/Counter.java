/*
 * Counter class creates a counter and increases, decreases the counter.
 */
package methodoverload;

/**
 *
 * @author umut
 */
public class Counter {
    private int value;
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public Counter(){                                                            //constructor with no parameter. initialize with zero.
        this(0);
    }
    
    public void increase(){                                                      // increase counter one.
        this.increase(1);
    }
    
    public void increase(int increaseBy){                                        // increase counter with increaseBy value.
        if(increaseBy >= 0){
            this.value += increaseBy;
        }     
    }
    
    public void decrease(){                                                      // decrease counter one.
        this.decrease(1);
    }
    public void decrease(int decreaseBy){                                        // decrease counter with decreaseBy value.
        if(decreaseBy >= 0){
            this.value -= decreaseBy;
        }    
    }
    
    public int value(){
        return value;
    }
    
    public String toString(){
        return "Count: " + this.value;
    }
}
