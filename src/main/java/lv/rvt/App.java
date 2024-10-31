package lv.rvt;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    

        
        public static void main( String[] args ) {
            int[] val0 = {0, 1, 2, 3}; 

            int sum = 0;
            for(int i = 0; i < val0.length; i++) {
                sum += val0[i];
            } 
            System.out.println( "Sum of all numbers = " + sum );
            
            int[] val = {13, -4, 82, 17}; 
            int[] twice;
            System.out.println( "Original Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
            twice = new int[val.length];
            for (int i = 0; i < val.length; i++) {
                twice[i] = 2 * val[i];

            }

            System.out.println(
                Arrays.toString(twice)
            );

    }
}