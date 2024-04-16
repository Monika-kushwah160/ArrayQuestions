
package com.mycompany.arrayquestions;
import java.util.*;
import java.io.*;

public class SortArray 
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
      int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
           }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
       
    }
}


