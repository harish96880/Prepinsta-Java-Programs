package Getting_Ready;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int result = 0;
        while(original != 0) {
            result = result * 10 + (original % 10);
            original /= 10;
        }
        System.out.println(result == number ? "Palindrome" : "Not a Palindrome");
    }
}
