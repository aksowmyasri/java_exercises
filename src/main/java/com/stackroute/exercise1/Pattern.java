package main.java.com.stackroute.exercise1;

import java.util.Scanner;

//Printing the pattern in the sequence 1223334444....nth sequence
public class Pattern
{
    public String printingPattern(int number)
    {
        String res="";
        Integer.parseInt(String.valueOf(number));
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++)
            {
                res+=i;
            }
        }
        return res;
    }
}
