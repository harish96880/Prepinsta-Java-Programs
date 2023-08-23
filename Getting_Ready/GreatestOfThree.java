package Getting_Ready;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        System.out.println(Math.max(Math.max(numberThree, numberTwo), numberOne));
    }
}