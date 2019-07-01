package main.java.com.stackroute.exercise1;

import java.util.Scanner;

public class VowelConsonant
{
    public String checkWhetherVowelOrConsonant(String inputword)
    {
        int length = inputword.length();//length of the input word
        String str="";
        //Checking whether th einput word is vowel or consonant
        for(int i=0;i<length;i++)
        {
            char letter = inputword.charAt(i);
            if(letter>='a'&&letter<='z'||letter>='A'&&letter<='Z') {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                    str=str.concat("Vowel");
                else {
                    str =str.concat("Consonant");
                }
            }
            else
                return str=str.concat("not a letter");
        }
        return str;
    }

}
