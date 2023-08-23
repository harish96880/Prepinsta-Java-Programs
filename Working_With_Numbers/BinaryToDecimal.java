package Working_With_Numbers;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while(binary > 0) {
            if (binary % 10 == 1) decimal += Math.pow(2, n);
            binary /= 10;
            n++;
        }
        System.out.println(decimal);
    }
}
