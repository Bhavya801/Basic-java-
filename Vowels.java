//Bhavya Sharma
//19csu371
//Print Vowel or Consonant, depending on the user input.
import java.util.*;
public class Vowels {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the character");
		String a=in.next().toLowerCase();
        boolean vowels = a.equals("a") || a.equals("e") || a.equals("i")
                || a.equals("o") || a.equals("u");

        if (a.length() > 1)
        {
            System.out.println("Error!.you have entered more then one character.");
        }
        else if (vowels)
        {
            System.out.println("Entered letter is Vowel");
        }
        else
        {
            System.out.println("Entered letter is Consonant");
        }

	}
}