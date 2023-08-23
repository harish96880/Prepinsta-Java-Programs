package Getting_Ready;
import java.util.Scanner;

public class FriendlyPair {
    static int getDivisors(int number) {
        int sum = 0;
        for(int i = 1; i < number; i++)
            if(number % i == 0) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int primeFactorsOfNumberOne = getDivisors(numberOne);
        int primeFactorsOfNumberTwo = getDivisors(numberTwo);
        System.out.println(primeFactorsOfNumberOne / numberOne == primeFactorsOfNumberTwo / numberTwo ? "Friendly Pair" : "Non friendly pair");
    }
}