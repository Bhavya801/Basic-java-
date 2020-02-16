//Bhavya Sharma 
//19csu371
// common elements 
import java.util.*;
class Common{
public static void  main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int arr1[] = new int[5];
      int arr2[] = new int[5];
      int i,j;
      System.out.print("Enter the elements of array 1: \n");
      for(i=0;i<arr1.length;i++) {
			System.out.println("Enter the element {"+(i+1)+"}: ");
			arr1[i]=input.nextInt();
			System.out.println();
			}
      System.out.print("Enter the elements of array 1: \n");
      for(i=0;i<arr1.length;i++) {
			System.out.println("Enter the element {"+(i+1)+"}: ");
			arr1[i]=input.nextInt();
			System.out.println();
			}
      for (i = 0; i < arr1.length; i++)
         {
           for (j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == (arr2[j]))
                System.out.println("Common element is : "+(arr1[i]));
             }
                
                       
     }
     }
     
   
                       