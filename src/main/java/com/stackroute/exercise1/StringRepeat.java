package main.java.com.stackroute.exercise1;

import java.util.Scanner;

//Program to print last n characters of a string n times and remaining characters 1 time.
public class StringRepeat
{
    public String toRepeatLastNCharactersOfTheString(String inputword,int numberofcharacter)
    {
        int length= inputword.length();
        String str="";
        String sub1 =inputword.substring(0,length-numberofcharacter);
        String sub2=inputword.substring(length-numberofcharacter);
        System.out.print(sub1);
        for(int n=0;n<numberofcharacter;n++)
        {
            str=str.concat(sub2);
        }
    return inputword.concat(str);
    }

}
