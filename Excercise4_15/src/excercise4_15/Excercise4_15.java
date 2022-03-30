/*
Chapter 4 Programming excercise 15
Riky Hernandez
8/31/21
Description: Finding the number corresponding to the letter based on phone key pad
*/
package excercise4_15;

import java.util.Scanner;

public class Excercise4_15 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
           //user inputs a letter
            System.out.print("Enter a letter ");
           String L = input.next();
            
            //the letter is then 
           char u = L.toUpperCase().charAt(0);
           int num = 0;
       
            if(Character.isLetter(u))
            {
                   if (u >= 'W')
                        num = 9;
                   else if (u >= 'T')
                        num = 8;
                   else if (u >= 'P')
                        num = 7;
                   else if (u >= 'M')
                        num = 6;
                   else if (u >= 'J')
                        num = 5;
                   else if (u >= 'G')
                        num = 4;
                        else if (u >= 'D')
                        num = 3;
                         else if (u >= 'A')
                        num = 2;
                          
                System.out.print("The corresponding number is " + num);
            }
                
                else
            {
                System.out.print(L + " is an invalid input.");
            }
                  

            
        
        
    }
    
}
