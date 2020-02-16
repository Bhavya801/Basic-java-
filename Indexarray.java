//Bhavya Sharma 
//19csu371
//to find the index of an array element in an array of size 10
import java.util.*; 
class Indexarray {
	public static void main(String args[]){
      Scanner in=new Scanner(System.in);
		int num[]=new int[10];
		int rowcounter;
		int searchElement;
		boolean flag;
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
			System.out.println("Enter the element {"+(rowcounter+1)+"}: ");
			num[rowcounter]=in.nextInt();
			System.out.println();
			}
      System.out.println("Elements in the array are:");
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
				System.out.println(num[rowcounter]);
		}   
		System.out.print("Enter the element to be searched :");
		searchElement=in.nextInt();
		
		flag=false;
		for(rowcounter=0;rowcounter<num.length;rowcounter++) {
			if(num[rowcounter]==searchElement) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Element found at location :" +rowcounter);
		}
		else{
			System.out.println("-1");
		}
	}
}