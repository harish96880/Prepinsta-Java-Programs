package Getting_Ready;

import java.util.Scanner;

public class PrimeFactor {
    static boolean isPrime(int number) {
        if(number == 1 || number == 0) return false;
        int count = 0;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) count++;
        }
        return (count > 0) ? false : true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 2; i <= number; i++) {
            if(isPrime(i)) {
                int original = number;
                while (original % i == 0) {
                    System.out.print(i + " ");
                    original /= i;
                }
            }
        }
    }
}
