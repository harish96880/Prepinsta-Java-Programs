package Getting_Ready;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int squareOfNumber = (int)Math.pow(number, 2);
        int original = number;
        int n = 0;
        while (original != 0) {
            n++;
            original /= 10;
        }
        int result = 0;
        while(n != 0) {
            result = ((squareOfNumber % 10)) + result * 10;
            squareOfNumber /= 10;
            n--;
        }
        original = result;
        int sum = 0;
        while (original != 0) {
            sum = sum * 10 + (original % 10);
            original /= 10;
        }
        System.out.println(sum == number ? "Automorphic number" : "Not a automorphic number");
    }
}
