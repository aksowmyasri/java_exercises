package main.java.com.stackroute.exercise1;

import java.util.Scanner;

//Progam to reverse the input String without String Buffer
public class StringReverse
{
    public String stringReverseWithoutStringBuffer(String original_word)
    {    String reverse="";
        int length=original_word.length();
        for(int i=length-1;i>=0;i--)
        {
            char c = original_word.charAt(i);

            reverse=reverse.concat(Character.toString(c));
        }
        return reverse;
    }

}
