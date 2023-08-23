package Getting_Ready;

import java.util.Scanner;

public class Factorial {
    static int fact(int number) {
        if(number == 1) {
            return number;
        }
        return number * fact(number - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fact(number));
        }
    }
