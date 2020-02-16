//Bhavya Sharma
//19csu371
//Star Rhombus
import java.util.*;
public class Starrhombus{
public static void main(String args[])
      {
         Scanner input=new Scanner(System.in);
         int i, j, rows;
         int stars, spaces;
   
         System.out.print("Enter rows to print : ");
         rows=input.nextInt();
    
    
         stars = 1;
         spaces = rows - 1;
    
    
         for(i=1; i<rows*2; i++)
         {
           
           for(j=1; j<=spaces; j++)
               System.out.print(" ");
           
           
           for(j=1; j<stars*2; j++)
               System.out.print("*");
           
          
           System.out.print("\n");
           
           if(i<rows)
            {
               spaces--;
               stars++;
            }
           else
            {
               spaces++;
               stars--;
            }
          }
    
  
      }
}