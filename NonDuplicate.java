//Bhavya Sharma 
//19csu371
// The program should display the non-duplicate entries only after each new value is read.
import java.util.*;
public class NonDuplicate{
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   int num[] = new int[5];
   int i,n,j; 
   System.out.print("Enter elements : ");
   for(i=0;i<5;i++)
   {
      num[i] = input.nextInt();
   }
   { 
        // Pick all elements one by one 
        for (i = 0; i < 5; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            for (j = 0; j < i; j++) 
            if (num[i] == num[j]) 
                break; 
      
            // If not printed earlier
            if (i == j) 
            System.out.print( num[i] + " "); 
        } 
    } 
}
}
