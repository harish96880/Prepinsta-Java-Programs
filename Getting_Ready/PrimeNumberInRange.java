package Getting_Ready;

import java.util.Scanner;

public class PrimeNumberInRange {
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
            int numberOne = sc.nextInt();
            int numberTwo = sc.nextInt();
            for(int i = numberOne; i <= numberTwo; i++) {
                if(isPrimeNumber(i)) System.out.print(i + " ");
            }
        }
    }


