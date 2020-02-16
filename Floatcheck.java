//Bhavya Sharma
//19csu371
//Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.*;	
public class Floatcheck {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		float number1;
		float number2;
		System.out.println("Enter the first number");
		number1=input.nextFloat();
		System.out.format("Round off number upto three decimal places is %.3f\n", number1);
		System.out.println("Enter the second number you want to compare");
		number2=input.nextFloat();
		System.out.format("Round off number upto three decimal places is %.3f\n", number2);
		int compare=Float.compare(number1,number2);
		if(compare>0)
			System.out.println("Number 1 is greater");
		else if(compare==0)
			System.out.println("Both numbers are equal");
		else
			System.out.println("Number 2 is greater");

	}
} 