package main.java.com.stackroute.exercise1;


//Program to check the number is even or odd between th range 20-30
public class EvenOdd {
    public String checkWhetherNumberIsEvenOrOdd(int input)
        {
            String result="";
            if(input>20 && input<30) {
                if (input % 2 == 0)
                    result="Jerry";
                else
                    result="Tom";

            }
            else
                result = "input incorrect";
            return result;
    }
}
