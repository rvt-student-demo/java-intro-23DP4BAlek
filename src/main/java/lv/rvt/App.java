package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
    
            Scanner scanner = new Scanner(System.in);

            Integer value = Integer.valueOf(scanner.nextLine());
            
            if (value <= 5000) {
                System.out.println("No tax!");
            } else if (value <= 25000) {
                double result = (100 + (value - 5000) * 0.08); 
                double resultAsD = (double) result;
                System.out.println(resultAsD);
            } else if (value <= 55000) {
                double result = (1700 + (value - 25000) * 0.1); 
                double resultAsD = (double) result;
                System.out.println(resultAsD);
            } else if (value <= 200000) {
                double result = (4700 + (value - 55000) * 0.12);
                double resultAsD = (double) result;
            System.out.println(resultAsD);
            } else if (value <= 1000000) {
                double result = (22100 + (value - 200000) * 0.15);
                double resultAsD = (double) result;
            System.out.println(resultAsD);
            } else if (value > 1000000) {
                double result = (142100 + (value - 1000000) * 0.17);
                double resultAsD = (double) result;
            System.out.println(resultAsD);
            }
  // Make your Hello World programm!
    }
}
