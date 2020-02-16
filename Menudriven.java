//Bhavya Sharma
//19csu371
/*program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
i)	Its elements.
ii)	Sum of all the elements
iii)	Largest number in the array
iv)	Smallest number in the array
v)	Second largest number in the array
vi)	Sum of alternate elements in the array
vii)	Count of even numbers in the array
viii)	Occurrence of a given number in the array and its frequency*/
import java.util.*;
public class Menudriven{
public static void add(int[] n)
{
   int sum=0,i;
   for(i=0;i<5;i++)
   {
      sum=sum+n[i];
   }
   System.out.print("The sum of element of array is: "+sum);
   }
public static void display(int[] n)
{
   int i;
   System.out.print("The elements of array are: ");
   for(i=0;i<5;i++)
   {
      System.out.print("\t"+n[i]);
   }
}
public static void largest(int[] n)
{
   int h=0,i;
   for(i=0;i<5;i++)
   {
      if(h<n[i])
      h=n[i];
   }
   System.out.println("The largest number in array is: "+h);
}
public static void smallest(int[] n)
{
   int h,i;
   h=n[0];
   for(i=1;i<5;i++)
   {
      if(h>n[i])
      h=n[i];
   }
   System.out.println("The smallest number in array is: "+h);
}

public static void secondLargest(int[] n)
{
   int h=0,h2=0,i;
  
   for(i=0;i<5;i++)
   {
      if(h<n[i])
      h=n[i];
   }
   
   for(i=0;i<5;i++)
   {
      if(h>n[i]&&h2<h)
      h2=n[i];
   }
   System.out.println("The second largest number in array is: "+h2);
}
public static void alternateSum(int[] n)
{
   int sum=0,i;
   for(i=0;i<5;i=i+2)
   {
      sum=sum+n[i];
   }
   System.out.println("The sum of alternate numbers is: "+sum);
}
public static void even(int[] n)
{
   int i,sum=0,count=0;
   for(i=0;i<5;i++)
   {
      if(n[i]%2==0)
      {
         sum = sum + n[i];
         count++;
      }
   }
      System.out.println("The number of even elements are "+count+" and there sum is "+sum);
}
public static void occurence(int[] n)
{
   int i,search,count=0;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the number you want to search: ");
   search = input.nextInt();
   for(i=0;i<5;i++)
   {
      if(search==n[i])
      {
         count++;
      }
   }
   System.out.println("The number "+search+" has occured "+count+" times");
}
public static void main(String[] args)
{
   int[] num = new int[5];
    Scanner input = new Scanner(System.in);
   int i,x;
   char ch='Y';
  do
  {
   System.out.print("Enter the values of array: ");
   for(i=0;i<5;i++)
   {
   num[i] = input.nextInt();
   }
   do{
    System.out.println("Press 1 to display all elements\nPress 2 to display sum of elements\nPress 3 to display largest number\nPress4 to display smallest number\nPress 5 to display second largest number\nPress 6 to print sum of alternate elements\nPress 7 to print number of even elements\nPress 8 to print occurence of a number and its frequency");
   x = input.nextInt();
   switch(x)
   {
      case 1: display(num);
              break;
      case 2: add(num);
              break;
      case 3: largest(num);
              break;
      case 4: smallest(num);
              break;
      case 5: secondLargest(num);
              break;
      case 6: alternateSum(num);
              break;
      case 7: even(num);
              break;
      case 8: occurence(num);
              break;
      default:
      System.out.println("Invalid Choice");
   }
   System.out.println("\nPress Y to contine and any other to enter the array again");
   
   ch = input.next().charAt(0);
   }while(ch=='Y'||ch=='y');
System.out.println("want to do it again? press any number press N to exit");
 ch = input.next().charAt(0);
 }while(ch!='N'||ch!='n');
}
}
