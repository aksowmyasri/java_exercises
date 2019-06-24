import java.util.Scanner;
//Program to check the number is even or odd between th range 20-30
public class EvenOdd {
    public static void checkWhetherNumberIsEvenOrOdd(int input)
        {

            if(input>20 && input<30)
            {

                if(input%2==0)
                    System.out.println("Jerry");
                else
                    System.out.println("Tom");
            }
    }
    public static void main(String[] args)
    {
        int input;
        Scanner scanner= new Scanner(System.in);
        input=scanner.nextInt();
        checkWhetherNumberIsEvenOrOdd(input);


    }
}
