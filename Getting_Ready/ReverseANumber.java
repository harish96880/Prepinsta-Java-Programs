package Getting_Ready;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        while(number != 0) {
            result = result * 10 + (number % 10);
            number /= 10;
        }
        System.out.println(result);
    }
}