package Getting_Ready;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) result += i;
        }
        System.out.println(result == number ? "It is a perfect Number" : "It is not a perfect Number");
    }
}
