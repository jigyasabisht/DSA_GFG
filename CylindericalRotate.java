// Cyclically rotate an array by one

/*
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
*/

import java.util.*;
public class CylindericalRotate
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
	    int temp= arr[n-1];
        for(int i= n-1;i>0;i--)
        
            arr[i]= arr[i-1];
        
        arr[0]=temp;
        for(int i=0;i<n;i++)
	    {
		    System.out.println(arr[i]);
	    }
	}
	
}
