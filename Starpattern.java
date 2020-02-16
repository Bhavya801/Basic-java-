//Bhavya Sharma
//19csu371
/*Print 
*
**
***
****
*****

*/

import java.util.*;
public class Starpattern  {
	public static void main(String args[]) {
   	 Scanner input = new Scanner(System.in);
       int i, j, n;
       System.out.print("Enter value of n: ");
       n=input.nextInt();
   
       for(i=1; i<=n; i++)
       {
           for(j=1; j<=i; j++)
           System.out.print("*");
           System.out.print("\n");
       }    
   
      
          
       }
}       