package Getting_Ready;

import java.util.Scanner;

public class PerfectSquare {
    static boolean isPerfectSquare(int number) {
        if(number > 0) {
            int squareRootOfNumber = (int) Math.sqrt(number);
            return (squareRootOfNumber*squareRootOfNumber == number);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println((isPerfectSquare(number)) ? "PerfectSquare" : "Not a perfect square");
    }
}
