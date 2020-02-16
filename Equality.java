//Bhavya Sharma
//19csu371
//program to test the equality of two arrays. 
import java.util.*;
class Equality{
public static void  main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int arr1[] = new int[5];
      int arr2[] = new int[5];
      int i;
      System.out.print("Enter the elements of array 1: \n");
      for(i=0;i<arr1.length;i++) {
			System.out.println("Enter the element {"+(i+1)+"}: ");
			arr1[i]=input.nextInt();
			System.out.println();
			}
      System.out.print("Enter the elements of array 1: \n");   
      for(i=0;i<arr2.length;i++) {
			System.out.println("Enter the element {"+(i+1)+"}: ");
			arr2[i]=input.nextInt();
			System.out.println();
			}
   check(arr1,arr2);
  }
static void  check(int[] my_array1, int[] my_array2)
  {
  boolean  equalOrNot = true;
  
  if(my_array1.length == my_array2.length)
  {
  for (int i  = 0; i < my_array1.length; i++)
  {
  if(my_array1[i] != my_array2[i])
  {
  equalOrNot = false;
  }
  }
  }
  else
  {
  equalOrNot  = false;
  }
  
  if  (equalOrNot)
  {
  System.out.println("Two arrays are equal.");
  }
  else
  {
  System.out.println("Two  arrays are not equal.");
  }
  }
  
  
  }