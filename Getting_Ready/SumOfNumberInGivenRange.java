package Getting_Ready;

import java.util.Scanner;

public class SumOfNumberInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        System.out.println((numberTwo * (numberTwo + 1) / 2) - (numberOne * (numberOne + 1)/ 2) + numberOne);
    }
}
