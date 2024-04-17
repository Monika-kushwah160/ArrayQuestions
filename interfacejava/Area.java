
package com.mycompany.interfacejava;


public class Area 
{
     public static void main(String[] args)
    {
         Rectangle n = new Rectangle();
        n.getArea(7, 3);
    }
    
}
interface Polygon 
{
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon 
{
    public void getArea(int length, int breadth) 
    {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}
