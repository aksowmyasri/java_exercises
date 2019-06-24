import java.util.Scanner;
//Program to check whether the input number is equal to original number;
public class NumberGuess
{
    public static void guessTheTargetNumber(int target_number)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1-50");

        while(true) {
            number = sc.nextInt();
            if (number > target_number)
                System.out.println("Number guessed is more then original number");
            else if (number < target_number)
                System.out.println("Number guessed is less than original number");
            else {
                System.out.println("Number guessed matches the original number");
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        int target_number=34;
        guessTheTargetNumber(target_number);

        }

}
