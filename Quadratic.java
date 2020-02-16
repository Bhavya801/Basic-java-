//Bhavya Sharma
//19csu371
//Solve Quadratic eqn
import java.util.*;
public class Quadratic {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
      int a,b,c;
      double D,root1,root2;
      System.out.print("Enter the Quadratic equation ax2 + bx + c = 0\n");
      System.out.print("Enter the coefficient of x2:");
      a=input.nextInt();
      System.out.print("Enter the coefficient of x:");
      b=input.nextInt();
      System.out.print("Enter the constant:");
      c=input.nextInt();
      D=b*b-4*a*c;
      if(D<0)
      System.out.print("real roots do not exist");
      else
         {
         root1=(-b+ Math.sqrt(D))/2*a;
         root2=(-b+ Math.sqrt(D))/2*a;
         System.out.print("Root 1: "+ root1);
         System.out.print("\nRoot 2: "+ root2);
         }
      }
      
}
      
      
      