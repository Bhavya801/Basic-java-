//Bhavya Sharma
//19csu371
//Pascal's Triangle
import java.util.*;
class Pascal{
	public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	int rows;
	int i;
	int j;
	int k;
	int number;
	char b;
	do {
		System.out.println("Please enter the number of rows you want");
		rows=input.nextInt();
		System.out.println("Pascal Triangle is :");
		for(i=0;i<rows;i++) {
			for(k=rows;k>i;k--) {
				System.out.print(" ");
					}
				number=1;
				for(j=0;j<=i;j++) {
					System.out.print(number+ " ");
					number=number*(i-j)/(j+1);
					}
					System.out.println();
				}
					System.out.println("Enter N to exit or press any key to continue");
					b=input.next().charAt(0);
			}
				while(b!='N');
         }
 }        