// Reverse of an Array 
// Efficient approch
// Time complexity is of theta of (n)
// Auxalliary space is theta of (1)

/* Input : 5
		   1 4 7 3 9
		   */

// Output : 9 3 7 4 1

import java.util.*;
public class Reverse_Arrayelement
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of array:");
	    int n = sc.nextInt();
	    System.out.println("Enter elements of array");
	    int ar[] = new int[n];
	    for(int i = 0;i<n;i++)
	    {
	        ar[i] = sc.nextInt();
	    }
	    int low = 0,high = n-1;
	    while(low<high)
	    {
	        int temp = ar[low];
	        ar[low] = ar[high];
	        ar[high] = temp;
	        low++;
	        high--;
	    }
	    for (int i = 0; i < n; i++)
             System.out.print(ar[i] + " ");
          
         System.out.println();
	}
}
