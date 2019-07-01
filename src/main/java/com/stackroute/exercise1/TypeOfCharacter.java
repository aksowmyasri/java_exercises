package main.java.com.stackroute.exercise1;

import java.util.Scanner;

//Program to specify whether the input character is capital or small letter or number or special character
public class TypeOfCharacter {
    public String checkTheTypeOfCharacter(char character)
    {
        String result="";
        if(character>='A'&&character<='Z')
            result="Capital letter";
        else if(character>='a'&&character<='z')
            result="Small case letter";
        else if(character>='0'&&character<='9')
            result="A Digit";
        else
            result ="Special Symbol";
        return result;

    }
}
