package main.java.com.stackroute.exercise1;

public class NumberGuess
{
    public String guessTheTargetNumber(int target_number,int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=1&&arr[i]<=50) {
                if (arr[i] > target_number)
                    System.out.println("Number guessed is more then original number");
                else if (arr[i] < target_number)
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
