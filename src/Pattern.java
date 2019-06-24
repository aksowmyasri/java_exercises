import java.util.Scanner;
//Printing the pattern in the sequence 1223334444....nth sequence
public class Pattern
{
    public static void printingPattern(int number)
    {
        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printingPattern(number);

    }
}
