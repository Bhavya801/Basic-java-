//Bhavya Sharma 
//19csu371
//maximum and minimum number
import java.util.*;
class MaxMin{
	public static void main(String args[])
	{		
      Scanner input=new Scanner(System.in);
      int array[] = new int[100];
      int i,n,max=0,min=0;
      System.out.print("Enter the length of array :");
      n=input.nextInt();
      for(i=0;i<n;i++) {
			System.out.println("Enter the element {"+(i+1)+"}: ");
			array[i]=input.nextInt();
			System.out.println();
			}
      max=array[0];
     for(i=0;i<n;i++)
     {
      if(array[i]>max)
      max=array[i];
     }
     min=array[0];
     for(i=0;i<n;i++)
     {
        if(array[i]<min)
        min=array[i];
     }
     System.out.print("Maximum number is : "+ max);
     System.out.print("\nMinimum number is : "+ min);
     
     
    }
 }        