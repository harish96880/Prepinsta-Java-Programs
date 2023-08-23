package Getting_Ready;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrimeNumber(int number) {
        if(number == 1) return false;
        int count = 0;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                count++;
            }
        }
        if(count > 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrimeNumber(number));
    }
}
