package Working_With_Numbers;

import java.util.Scanner;

public class HexaDecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexa = sc.nextLine();
        int decimal = Integer.parseInt(hexa, 16);
        System.out.println(decimal);
    }
}
