package main.java.com.stackroute.exercise1;

import java.util.Scanner;

//Progam to reverse the input String without String Buffer
public class StringReverse
{
    public String stringReverseWithoutStringBuffer(String originalword)
    {    String reverse="";
        int length=originalword.length();
        for(int i=length-1;i>=0;i--)
        {
            char c = originalword.charAt(i);

            reverse=reverse.concat(Character.toString(c));
        }
        return reverse;
    }

}
