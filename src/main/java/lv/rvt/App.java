package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int result1 = first * second;
        double result = 1.0 * first / second;
        int result2 = first + second;
        int result3 = first - second;
        System.out.println(first + "+" + second + "=" + result2);
        System.out.println(first + "-" + second + "=" + result3);
        System.out.println(first + "*" + second + "=" + result1);
        System.out.println(first + "/" + second + "=" + result);
  // Make your Hello World programm!
    }
}
