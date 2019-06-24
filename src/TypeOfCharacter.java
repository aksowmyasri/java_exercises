import java.util.Scanner;
//Program to specify whether the input character is capital or small letter or number or special character
public class TypeOfCharacter {
    public static void checkTheTypeOfCharacter(char character)
    {
        if(character>='A'&&character<='Z')
            System.out.println("Capital letter");
        else if(character>='a'&&character<='z')
            System.out.println("Small case letter");
        else if(character>='0'&&character<='9')
            System.out.println("A Digit");
        else
            System.out.println("Special Symbol");

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        checkTheTypeOfCharacter(character);



    }
}
