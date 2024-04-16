
package com.mycompany.arrayquestions;
import java.util.*;
import java.io.*;

public class MaxElement 
{
    public static void main(String[] args) {
        
    
       Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=scn.nextInt();
       int arr[] = new int[n];
    System.out.print("Enter number:");
       for(int i=0;i<n;i++)
       {
           arr[i] = scn.nextInt();
       }
       
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int ans = max;
        System.out.println("Maximum Number:"+ans);
    }
    
}

