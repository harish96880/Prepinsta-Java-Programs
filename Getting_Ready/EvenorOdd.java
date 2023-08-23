package Getting_Ready;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = number % 2 != 0 ? "Odd number" : "Even number";
        System.out.println(result);
    }
}
