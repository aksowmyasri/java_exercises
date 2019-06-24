import java.util.Scanner;
//Progam to reverse the input String without String Buffer
public class StringReverse
{
    public static void stringReverseWithoutStringBuffer(String original_word)
    {
        int length=original_word.length();
        for(int i=length-1;i>=0;i--)
        {
            System.out.print(original_word.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        String original_word;
        Scanner sc = new Scanner(System.in);
        original_word=sc.nextLine();
        stringReverseWithoutStringBuffer(original_word);



    }
}
