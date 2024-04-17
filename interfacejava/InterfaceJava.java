

package com.mycompany.interfacejava;


public class InterfaceJava 
{

    public static void main(String[] args)
    {
         Bank r1 = new BankOfBaroda();
        r1.RateInterest("23476542", "monika");
        Bank r2 = new SBI();
        r2.RateInterest("76589364", "Payal");
    }
}
interface Bank 
{
    void RateInterest(String accountNo, String name);
}

class BankOfBaroda implements Bank 
{
    public void RateInterest(String accountNo, String name) 
    {
        System.out.println("Account Number of BankOfBaroda: " +accountNo );
    }
}

class SBI implements Bank 
{
    public void RateInterest(String accountNo, String name) 
    {
        System.out.println("Customer Name of SBI: " +name );
    }
}


