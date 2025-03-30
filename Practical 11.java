package javaapplication4;

/**
 *
 * @author anjal
 */
public class Plants {
    
    public static void Photosynthesis(){
        System.out.println("Carry Photosynthesis!..");
    }
    
    public static void Reproduce(){
        System.out.println("Reproduce through seeds..");
    } 
    
    public static void Flowers(){
        System.out.println("Produce flowers..");
    }
    
}
package javaapplication4;

/**
 *
 * @author anjal
 */
class Shrubs extends Plants{

public static void features(){
    System.out.println("Small in height");
} 

public static void function(){
    System.out.println("improves soil fertility");
}
}
ackage javaapplication4;

/**
 *
 * @author anjal
 */
 class Herbs extends Plants{
     
     public static void display(){
         System.out.println("Medicine use");
     }
}

class Trees extends Plants{

public static void features(){
System.out.println("Large in height");
}
}

package javaapplication4;

/**
 *
 * @author anjal
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass1 obj=new NewClass1();
        obj.features();
        obj.Photosynthesis();
        obj.Reproduce();
        obj.Flowers();
        obj.function();
        
        
    }
    
}
