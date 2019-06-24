import java.util.Scanner;
//Program to print last n characters of a string n times and remaining characters 1 time.
public class StringRepeat
{
    public static void toRepeatLastNCharactersOfTheString(String input_word,int number_of_character)
    {
        int length= input_word.length();
        String sub1 =input_word.substring(0,length-number_of_character);
        String sub2=input_word.substring(length-number_of_character);
        System.out.print(sub1);
        for(int n=0;n<number_of_character;n++)
        {
            System.out.print(sub2);
        }

    }
    public static void main(String[] args)
    {
        String input_word;
        int number_of_character;
        Scanner sc = new Scanner(System.in);
       input_word=sc.nextLine();
        number_of_character=sc.nextInt();
        toRepeatLastNCharactersOfTheString(input_word,number_of_character);



    }
}
