package main.java.com.stackroute.exercise1;

import java.util.Scanner;

//Program to specify whether the input character is capital or small letter or number or special character
public class TypeOfCharacter {
    public String checkTheTypeOfCharacter(char character)
    {
        if(character>='A'&&character<='Z')
            return "Capital letter";
        else if(character>='a'&&character<='z')
            return "Small case letter";
        else if(character>='0'&&character<='9')
            return "A Digit";
        else
            return "Special Symbol";

    }
}
