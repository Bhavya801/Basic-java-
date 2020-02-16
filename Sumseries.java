//Bhavya Sharma
//19csu371
//Compute the sum of the series: 1+x+x2 /2!+x3/3!+…
import java.util.*;
public class Sumseries{
     public static void main(String args[]) 
    {
    	Scanner inp=new Scanner(System.in);
      int sum=1;
         System.out.println("enter the number x");
         int p=inp.nextInt();
         System.out.println("enter the number of terms");
         int q=inp.nextInt();
            for(int i=1;i<q;i++)
               { sum=sum+(power(p,i)/fact(i));
               }System.out.println("the sum is:"+sum);
     }
                  public static int power(int a,int b){
                  int g=1;
                  for(int j=0;j<b;j++)
                     {
                        g=g*a;
                     }
                        return g;
                  
                  }
                  
                  public static int fact(int c){
                  int e=1;
                  for(int k=1;k<=c;k++)
                     {
                     e=e*k;
                     }
                     return e;
                  }
}

