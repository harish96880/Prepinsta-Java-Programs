package Working_With_Numbers;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println(Integer.toBinaryString(decimal));
    }
}
