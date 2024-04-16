

package com.mycompany.arrayquestions;
//import java.util.*;
import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;


public class SecondLargestNumber 
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
        int sec=-1;
        int larg = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>larg)
            {
                larg=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>sec && arr[i]!=larg)
            {
                sec = arr[i];
            }
        }
        int ans = sec;
        System.out.println("Second largest Number:"+ans);
    }
}

    

