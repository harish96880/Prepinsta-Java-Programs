package Getting_Ready;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int divisor = 0;
        while(original != 0) {
            divisor += original % 10;
            original /= 10;
        }
        System.out.println(number % divisor == 0 ? "Harshad Number" : "Not a harshad number");
    }
}
