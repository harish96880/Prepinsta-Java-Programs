package Getting_Ready;

import java.util.Scanner;

public class GreatestNumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        System.out.println(Math.max(numberTwo, numberOne));
    }
}
