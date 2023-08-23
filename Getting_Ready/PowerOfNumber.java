package Getting_Ready;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        System.out.println((int)Math.pow(numberOne, numberTwo));
    }
}
