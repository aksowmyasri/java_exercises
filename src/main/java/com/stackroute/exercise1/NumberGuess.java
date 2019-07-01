package main.java.com.stackroute.exercise1;
//PROGRAM TO GUESS THE NUMBER
public class NumberGuess
{
    public String guessTheTargetNumber(int targetnumber,int[] arr)
    {
        String result = "u didnt play well";
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=1&&arr[i]<=50) {
                if (arr[i] == targetnumber){


                    result = "";
                    result = result + "Number guessed matches the original number";
                }
            }
            else {
                result = "";
                result = result + "numbers not in range";
            }
        }
        return result;
    }

}
