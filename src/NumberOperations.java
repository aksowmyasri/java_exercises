import java.util.Arrays;
import java.util.Scanner;
//Program to
// sort the number in non-increasing order
// after sorting sum all the even numbers, the sum should be greater than 15 .
// if sum is more than 15,then print output as true or false.
public class NumberOperations
{
    public static void sortDecreasingOrderAndPrintSumOfEvenNumbers(String number)
    {
        int sum=0;
        int length= number.length();
        char tempArray[] = number.toCharArray();
        Arrays.sort(tempArray);
        String original = new String(tempArray);
        StringBuilder stringBuilder = new StringBuilder(original);
        original = stringBuilder.reverse().toString();
        System.out.println(original);
        for(int i=0;i<length;i++)
        {
            int j = Character.getNumericValue(original.charAt(i));
            if(j%2==0)
            {
                sum=sum+j;
            }
        }
        System.out.println("Sum of even numbers: "+sum);
        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");


    }
    public static void main(String[] args)
    {

        String number;
        Scanner sc = new Scanner (System.in);
        number=sc.nextLine();
        sortDecreasingOrderAndPrintSumOfEvenNumbers(number);
    }
}
