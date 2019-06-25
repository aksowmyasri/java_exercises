package main.java.com.stackroute.exercise1;

import java.util.Arrays;
import java.util.Scanner;

//Program to
// sort the number in non-increasing order
// after sorting sum all the even numbers, the sum should be greater than 15 .
// if sum is more than 15,then print output as true or false.
public class NumberOperations
{
    public String sortDecreasingOrderAndPrintSumOfEvenNumbers(String number)
    {
        String output="";
        int sum=0;
        int length= number.length();
        char tempArray[] = number.toCharArray();
        try {
            Integer.parseInt(number);
            Arrays.sort(tempArray);
            String original = new String(tempArray);
            StringBuilder stringBuilder = new StringBuilder(original);
            original = stringBuilder.reverse().toString();
            output = output.concat(original);
            output = output.concat(" ");

            for (int i = 0; i < length; i++) {
                int j = Character.getNumericValue(original.charAt(i));
                if (j % 2 == 0) {
                    sum = sum + j;
                }
            }
            String add = Integer.toString(sum);
            output = output.concat(add);
            output = output.concat(" ");
            if (sum > 15)
                return output.concat("true");
            else
                return output.concat("false");
        }
        catch(Exception e)
        {
            return "format is invalid";
        }


    }
}
