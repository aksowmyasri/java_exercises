package main.java.com.stackroute.exercise1;
//PROGRAM TO GUESS THE NUMBER
public class NumberGuess
{
    public String guessTheTargetNumber(int targetnumber,int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=1&&arr[i]<=50) {
                if (arr[i] > targetnumber)
                    System.out.println("Number guessed is more then original number");
                else if (arr[i] < targetnumber)
                    System.out.println("Number guessed is less than original number");
                else {
                    return "Number guessed matches the original number";
                }
            }
            else
                return "numbers not in range";
        }
        return "u didnt play well";
    }

}
