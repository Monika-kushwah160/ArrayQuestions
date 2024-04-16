
package com.mycompany.arrayquestions;
import java.util.*;
import java.lang.*;

public class MissingNumber 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=scn.nextInt();
       int arr[] = new int[n];
       System.out.print("Enter number:");
       for(int i=0;i<n-1;i++)
       {
           arr[i] = scn.nextInt();
       }
        int sum=n*(n+1)/2;
       int sum2=0;
       for(int i=0;i<n-1;i++)
       {
           sum2+=arr[i];
        }
       int ans = sum-sum2;
       
        System.out.println("Answer:"+ans);
        
    }
    
}

