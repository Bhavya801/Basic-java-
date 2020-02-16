//Bhavya Sharma 
//19csu371
//Split the array and add the first part to the end. There is a given an array and split it from a specified position, and move the first part of array add to the end.


import java.util.*;
class Split { 
    public static void splitArr(int arr[], int n, int k) 
    { 
        for (int i = 0; i < k; i++) {
            int x = arr[0]; 
            for (int j = 0; j < n - 1; ++j) 
                arr[j] = arr[j + 1]; 
            arr[n - 1] = x; 
        } 
    } 
  
 
    public static void main(String[] args) 
    { 
        
        Scanner input = new Scanner(System.in);
        int arr[] =new int[6]; 
        int n = arr.length; 
        int position = 2;
        int i;
      System.out.print("Enter the elements of array : \n");
      for(i=0;i<n;i++) {
			System.out.println("Enter the element {"+(i+1)+"}: ");
			arr[i]=input.nextInt();
			System.out.println();
			}
        splitArr(arr, 6, position); 
  
        for (i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
    } 
} 
  