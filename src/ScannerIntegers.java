import java.util.Scanner;
//Scans and prints the sum of unspecified scanner inputs
public class ScannerIntegers {
    public static void scanUnspecifiedArgumentsOfIntegersAndPrintSum()
    {
        int number;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        while((number=scanner.nextInt())!=0)
        {
            sum=sum+number;

        }

        System.out.println(sum);
    }
    public static void main(String[] args)
    {

        scanUnspecifiedArgumentsOfIntegersAndPrintSum();
    }
}
