package main.java.com.stackroute.exercise1;

import java.util.Scanner;

public class Palindrome
{
    public String checkForPalindrome(String orginal)
    {
        String result="";
        String reverse="";
        int sum=0;
        int length=orginal.length();
        try {
            Integer.parseInt(orginal);
            // Reverse of the number
            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + orginal.charAt(i);
            //checking for equality
            if (orginal.equals(reverse)) {
                char c;
                //sum of even numbers

                for (int j = 0; j < length; j++) {
                    c = orginal.charAt(j);
                    int a = Character.getNumericValue(c);
                    if (a % 2 == 0)
                        sum = sum + a;
                }

                //checking iid=f the sum is greater than 25 and printing
                if (sum > 25)
                    result=orginal + " is palindrome and the sum of even numbers is greater than 25";
                else
                    result=orginal + " is palindrome and the sum of even numbers is less than 25";
            } else {
                result=orginal + " " + "is not a palindrome";
            }
        }
        catch(Exception e)
        {
            result="invalid input";
        }
        return result;
        }





    }

