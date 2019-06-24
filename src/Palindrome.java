import java.util.Scanner;

public class Palindrome
{
    public  static void checkForPalindrome(String orginal)
    {
        String reverse="";
        int sum=0;
        int length=orginal.length();
        // Reverse of the number
        for(int i=length-1;i>=0;i--)
            reverse = reverse+ orginal.charAt(i);
        //checking for equality
        if(orginal.equals(reverse))
        {
            char c;
            //sum of even numbers
            for(int j=0;j<length;j++)
            {
                c=orginal.charAt(j);
                int a=Character.getNumericValue(c);
                if(a%2==0)
                    sum=sum+a;
            }
            //checking iid=f the sum is greater than 25 and printing
            if(sum>25)
                System.out.println(orginal+"  is palindrome and the sum of even numbers is greater than 25");
            else
                System.out.println(orginal+"   is palindrome and the sum of even numbers is less than 25");
        }
        else{
            System.out.println(orginal+" "+"is not a palindrome");
        }

    }
    public static void main(String[] args)
    {
        String orginal;
        Scanner scanner = new Scanner(System.in);
        orginal=scanner.nextLine();
        checkForPalindrome(orginal);



    }
}
