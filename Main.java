
 import java.util.*;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      
         System.out.println("How many numbers has array enter = ");
         Scanner input = new Scanner(System.in);
         int number = input.nextInt();
         int array[ ] = new int [ number ]; 
         int look[ ] = new int [ number ]; 
         for (int i = 0; i < number; i++) {
             System.out.println((i+1) + ". enter number = > ");
             array[i] = input.nextInt();
             
        }
         int looknumber = 0;
         for (int i = 0; i < number; i++) {
             int a = 0;
             for (int j = 0; j < number; j++) {
                 if(array[i]==look[j])
                 {
                     a++;
                 }
             }
             if(a == 0 )
             {
                 int numberofnumbers = 0;
                 for (int t = 0; t < number; t++) {
                     if(array[i]==array[t])
                     {
                         numberofnumbers ++;
                     }
                 }
                 look[looknumber] = array[i];
                 looknumber ++;
                 System.out.println(array[i] + " number of  " + numberofnumbers + "  integers  ");
                 
                     
             }
        }
       
         int N = 0;
            int numberrepeats = 0;
            int temporarynumbers= 1;

            for (int i = 0; i < array.length-1; i++)
            {
                if (array[i] == array[i + 1])
                    temporarynumbers++;
                
                if( i==(array.length-2) || array[i] != array[i+1])
                {
                    if (temporarynumbers > numberrepeats)
                    {
                        numberrepeats = temporarynumbers;
                        N = array[i];
                    }
                   
                    temporarynumbers = 1;
                }
            } 
         
 System.out.println(N + " number more than other numbers it  " + numberrepeats + "  repeats .");       
        
      }
   
}