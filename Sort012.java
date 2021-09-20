// Sort an array of 0s, 1s and 2s

/*
Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
*/

import java.util.*;
public class Sort012
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter elements of array");
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    Arrays.sort(arr);
        for(int i=0;i<n;i++)
	    {
		    System.out.print(arr[i]);
	    }
	}
	
}
