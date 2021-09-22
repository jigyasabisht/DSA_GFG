// Find the Duplicate Number

/*
Input: nums = [1,3,4,2,2]
Output: 2
*/

import java.util.*;
public class Duplicate_number
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); 
        for(int i=0;i<n;i++)
        {
            if(arr[i] == arr[i+1])
                System.out.println(arr[i]);
        }
    }
}
