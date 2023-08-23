package Getting_Ready;

import java.util.Scanner;

public class StrongNumber {
    static int fact(int number) {
        if(number == 1) {
            return number;
        }
        return number * fact(number - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        int original = number;
        while(original != 0) {
            result += fact(original % 10);
            original /= 10;
        }
        System.out.println((result == number) ? "Strong Number" : "Not a strong number");
    }
}
