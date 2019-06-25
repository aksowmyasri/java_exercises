package main.java.com.stackroute.exercise1;

import java.util.Scanner;

//Program to print last n characters of a string n times and remaining characters 1 time.
public class StringRepeat
{
    public String toRepeatLastNCharactersOfTheString(String input_word,int number_of_character)
    {
        int length= input_word.length();
        String str="";
        String sub1 =input_word.substring(0,length-number_of_character);
        String sub2=input_word.substring(length-number_of_character);
        System.out.print(sub1);
        for(int n=0;n<number_of_character;n++)
        {
            str=str.concat(sub2);
        }
    return input_word.concat(str);
    }

}
