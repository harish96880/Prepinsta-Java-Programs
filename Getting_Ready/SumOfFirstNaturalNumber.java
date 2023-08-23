package Getting_Ready;

import java.util.Scanner;

public class SumOfFirstNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println((number * (number + 1)) / 2);
    }
}
