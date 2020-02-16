//Bhavya Sharma 
//19csu371
/*program that reads a 2-D integer array with each element of
maximum 2 digits and prints the following:
a) Elements of the entered array.
b)elements of the array after eachelement is multiplied by 2 if it is an odd number.*/
import java.util.*;
public class Matrix{

public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   int arr[][] = new int[3][3];
   int n,i,j;
   System.out.println("Enter the elements of matrix: ");
   for(i=0;i<3;i++)
   {
      for(j=0;j<3;j++){
      arr[i][j] = input.nextInt();
      if(arr[i][j]>99)
      {
         System.out.println("Error!!! The entered number is more than 2 digits \nPlease re-enter the number ");
         arr[i][j] = input.nextInt();
      }
   }}
   System.out.println("The matrix is:");
   for(i=0;i<3;i++)
   {
      for(j=0;j<3;j++)
      System.out.print(arr[i][j]+" ");
      System.out.print("\n");
   }
    for(i=0;i<3;i++)
   {
      for(j=0;j<3;j++)
      if(arr[i][j]%2==1)
         arr[i][j]=arr[i][j]*2;
      else 
         continue;
   }
   System.out.println("The updated matrix is:");
   for(i=0;i<3;i++)
   {
      for(j=0;j<3;j++)
      System.out.print(arr[i][j]+" ");
      System.out.print("\n");
   }
}
}


