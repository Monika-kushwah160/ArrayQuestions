
package com.mycompany.arrayquestions;
import java.util.*;
import java.io.*;

public class MinElement 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=scn.nextInt();
       int arr[] = new int[n];
    System.out.print("Enter number:");
       for(int i=0;i<n;i++)
       {
           arr[i] = scn.nextInt();
       }
       int ans = new Solution().MinNumber(arr, n);
        System.out.println(ans);
    }
    
}
class Solution
{
    int MinNumber(int arr[],int n)
    {
       int min=arr[n-1];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
     
}
