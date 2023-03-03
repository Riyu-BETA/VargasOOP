
package vargaspayroll;
import java.util.Scanner;

public class VargasPayroll {
    private static int num;
    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter an integer : ");
      num = s.nextInt();
      System.out.println (num + " plus 10 is  " + showNumberPls10());
      System.out.println (num + " plus 100 is " + showNumberPls100());
      System.out.println(num + " plus 1000 is " + showNumberPlu1000());
    }
    
    private static int showNumberPls10()
    {
    return num + 10;
    }
    private static int showNumberPls100()
    {
    return num + 100;
    }
    private static int showNumberPlu1000()
    {
    return num + 1000;
    }
}
