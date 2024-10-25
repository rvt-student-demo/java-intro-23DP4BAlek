package lv.rvt;

import java.util.Scanner;

public class App 
{
    

        
        public static void christmasTree(int height) {
            
            for (int i = 1; i <= height; i++) {
                printSpaces(height - i);
                printStars(2 * i + 1);
                System.out.println();
            }
    
            
            for (int i = 0; i < 2; i++) {
                printSpaces(height - 1);
                printStars(3);
                System.out.println();
            }
        }
    
        
        private static void printSpaces(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print(" ");
            }
        }
    
        
        private static void printStars(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
        }
    
        
        public static void main(String[] args) {
            christmasTree(15);  
        
    }
}