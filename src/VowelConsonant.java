import java.util.Scanner;

public class VowelConsonant
{
    public static void checkWhetherVowelOrConsonant(String input_word)
    {
        int length = input_word.length();//length of the input word
        //Checking whether th einput word is vowel or consonant
        for(int i=0;i<length;i++)
        {
            char letter = input_word.charAt(i);
            if(letter>='a'&&letter<='z'||letter>='A'&&letter<='Z') {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                    System.out.println("Vowel");
                else
                    System.out.println("Consonant");
            }
            else
                System.out.println("not a letter");
        }
    }
    public static void main(String[] args){
        String input_word;
        Scanner scanner = new Scanner(System.in);
        //Taking the input
        input_word=scanner.nextLine();
        checkWhetherVowelOrConsonant(input_word);

    }
}
