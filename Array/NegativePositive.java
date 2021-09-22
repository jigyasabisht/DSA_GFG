//Move all negative numbers to beginning and positive to end with constant extra space


import java.util.*;
public class NegativePositive
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
	    int j=0,temp;
	    for(int i = 0;i<n;i++)
	    {
	        if (ar[i] < 0) 
	        {
                if (i != j) 
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
                j++;
            }
	    }
	    //Printing modified array
	    for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
	}
}
