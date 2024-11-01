package lv.rvt;


import java.util.Scanner;

public class App 
{        
        public static void main( String[] args ) {
            Scanner reader = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            String longestName = "";
            
            while (true) {
                String input = reader.nextLine();
                if (input.equals("")) {
                    break;
                }
    
                String[] parts = input.split(",");

                int age;
                    age = Integer.parseInt(parts[1].trim());

                
                sum += age;
                count++;
                

                String name = parts[0].trim();
                if (name.length() > longestName.length()) {
                    longestName = name;
                }
            }
            
            if (count > 0) {
                System.out.println("Longest name: " + longestName + ", Date of birth average: " + (1.0 * sum / count));
            } else {
                System.out.println("No input.");
            }
                }
    }