package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
    
            Scanner scanner = new Scanner(System.in);

            int value = Integer.valueOf(scanner.nextLine());
            
            if (value < 0) {
                System.out.println("impossible");
            } else if (value <= 49) {
                System.out.println("failed");
            } else if (value <= 59) {  
                System.out.println("1");
            } else if (value <= 69) {
                System.out.println("2");
            } else if (value <= 79) {
                System.out.println("3"); 
            } else if (value <= 89) {
                System.out.println("4");
            } else if (value <= 100) {
                System.out.println("5");
            } else if (value > 100) {
                System.out.println("Incredible!");
            }
        
  // Make your Hello World programm!
    }
}
