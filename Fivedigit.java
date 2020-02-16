//Bhavya Sharma 
//19csu371
//application that inputs one number consisting of five digits from the user, separates the number into its individual digits
import java.util.*;
public class Fivedigit {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int p,rem=0,rev=0;
		char b;
		do
		{
		System.out.println("Please enter the five digit integer ");
		p=input.nextInt();
		if(p>99999 || p<9999)
			System.out.println("Entered number is not a five digit number");
		else 
			{
				for(int i=0;i<5;i++)
              {
                rem=p%10;
                rev=rev*10+rem;
                p=p/10;
               }
             for(int i=0;i<5;i++)
               {
                 int w=rev%10;
                 rev=rev/10;
                 System.out.print(w+"   ");
                }

			}
			System.out.println("Press N to exit and press any key to continue");
			b=input.next().charAt(0);
		}
		while(b!='N');
	}	 
}