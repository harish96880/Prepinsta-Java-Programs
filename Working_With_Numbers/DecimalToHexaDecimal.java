package Working_With_Numbers;

import java.util.Scanner;

public class DecimalToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println(Integer.toHexString(decimal));
    }
}
