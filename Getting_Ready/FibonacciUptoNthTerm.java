package Getting_Ready;

import java.util.Scanner;

public class FibonacciUptoNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int number = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");
        for(int i = 2; i < number; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
